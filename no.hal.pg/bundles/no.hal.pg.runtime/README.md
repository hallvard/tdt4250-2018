# no.hal.pg.runtime - the generic runtime model

## Introduction
This project contains two models, the generic *runtime* model containing the generic classes for (representing) the game state during execution, and a *view* model used for providing individual players a view onto the shared runtime state. The game model is in [model/runtime.ecore](model/runtime.ecore), while the view model is in [model/app.ecore](model/app.ecore).

## The game model

### Overview

A **Game** consists of a set of **Tasks** that one or more **Player**s perform. A **Task** must be explicitly *started*, but to allow this, one or more **Condition**s must be satisfied. Similarly, a **Task** must be explicitly *finished*, but must satisfy a number of **Condition**s to be considered so. 

**Player**s inherit from **GeoLocation**, and always have a location in the environment.

**Player**s may posess **Item**s, that may provide some capability, carry information etc, and may be needed for performing **Task**s. After finishing a **Task**, a **Player** may receive **Item**s as *reward* (modelled, but not yet implemented). **Item**s may also exist in the environment, at a **GeoLocation**, waiting to be picked up (somehow).

### <a name="Game">Game</a>

A game consisting of a set of **Player**s, **Item**s and **Task**s. The **Game** is parameterized by the **Task** type it contains, so you can make **Game** subclasses that may assume all the **Task** are of a specific type.

### <a name="Player">Player</a>

The **Player**s are the ones playing the game. It refers to a **Person** providing the identity, and there will be one **Player** for each **Game** a **Person** plays. **Player** inherits from **GeoLocation**, see the [OSM model](../no.hal.pg.osm/#GeoLocation), and hence has a location in the game environment.

A **Player** carries a set of **Item**s, that may be necessary for performing **Task**s.

### <a name="Task">Task</a>

A **Task** is a part of a **Game** and is performed by one or more **Player**s. A **Task** has a *result* of some kind, e.g. EBoolean to indicate success or failure or EDouble as the success rate or points. The **Task** class is parameterized by the type of the result (an **EDataType**, since the result is stored in an **EAttribute**), and sub-classes should provide this type argument.

 A tasks has three main states: *not-started*, *started* and *finished*, and to transition corresponding **start** and **finish** methods must be called. The **finish** method takes the result as its only argument. The default implementations stores the timestamp of the transition, and uses it to indicate the state. Note however, that it is the **isStarted** and **isFinished** methods that determine if the **Task** is in the corresponding state. The default implementations checks the corresponding timestamps, but subclasses may override them (see below).

However, to be allowed to start, a task must satisfy a set of **startConditions**. This can be checked by calling the **canStart** method, and the **start** method will throw an exception if **canStart** returns false. Similarly, to be allowed to finish, a task must satisfy a set of **finishConditions**, and this is checked by the **finish** method.

**Task** subclasses can decide to either use **Condition**s to limit when a **Task** may be started and/or finished, or override the **isStarted** and/or **isFinished** methods.

A **Task** may contain a set of *reward* **Item**s, that is given to the **Player** finishing the task (modelled, but not implemented).

A **ResettableTask** is a **Task** that can be **reset** to the *not-started* state. The default reset implementation is to clear the **startTime** and **finishTime** timestamps and **result** value. 

The **AcceptTask** subclass is provided for demonstration and testing purposes.

### <a name="Item">Item</a>

**Item**s are things that may exist in the environment or be carried by **Player**s. **Item**s have a location, either the **Player**'s, when they are owned, or their own, when they are part of the environment. The meaning of an **Item** is determined by its **getDescription()** method (and how it's rendered by a client) and how it is used by **Task**s.

The **InfoItem** is an **Item** carrying information for the **Player**, and may used for hints and instructions for tasks, e.g. by using it as a reward from finishing one task and needed to perform the next.

### <a name="Runtime">Runtime</a>

**Runtime** is a root container class, you use it to contain several **Game** instances and when you need to include instances from the [Arc model](../no.hal.pg.arc/), e.g. **Person**, **Role** and **Capability**.

### <a name="Condition">Condition</a>

The **Condition** interface is similar Java 8's Predicate interface, its **test** method answers yes or no, depending on some (internal) state, e.g. that a referenced **Task** has is started or finished. Each sub-class must include the state to test, typically references to other **EObject**s. **Condition** is used for the **startConditions** and **finishConditions** features of **Task**, to make the logic for isStarted and isFinished easier to extend. Instead of subclassing and overriding these methods, you can add **Condition** objects to the corresponding features.

The **AbstractCondition** class is a useful superclass for **Condition** implementations, it includes a generic **context** feature that can be used in the **test** method implementation.

The **CompositeCondition** class can be used for and/or logic over several contained **Condition**s. The **logic** feature determines which: a **false** value gives *and* logic, a **true** value *or*. Think of the logic value as the value that short-circuits the loop over **Condition**s, for *and* it should return the first **false** value, for *or* it should return the first **true** value.  

Subclasses:
- **IsTaskStartedCondition**/**IsTaskFinishedCondition** - tests if the **Task** context object is started/finished
- **IsByGeoLocationCondition** - tests if the *any* or *all* the provided **GeoLocated** objects are at a certain distance (range) to the **GeoLocated** context object. Whether to use *any* (or) or *all* (and) logic is determined by the **logic** feature, which works the same as for **CompositeCondition**.

## The view model

### Overview

The **view** model has a dual purposes, 1) wrap/encapsulate the (internal) runtime state, so only relevant state is exposed, and 2) store client UI state. Each **Player** will typically have its own view model instance wrapping a shared runtime model instance. Each view object will refer to a corresponding runtime state object, and be structured in a hierarchy similar to the runtime state, usually in separate **Resource**s.

Hence, there is a **GameView** class that wraps a **Game** and a **TaskView** that wraps a **Task**. The **MapView**, on the other hand, does not wrap another object, but stores the panning and zoom state of a map UI component.

### <a name="View">View</a>

Abstract class for views that are for or on behalf of some user. The **U** type parameter indicates the class that represents the user concept, e.g. **Person**, if the ARC model is used directly, or **Player**, for **GameView**s. The **user** feature of type **U** is *derived*, and is by default retrieved from the container object. Hence, some object up the hierarchy must override the **getUser** method and return an actual reference. **GameView** does this by having a *derived* **Player** reference, were the value is retrieved from the wrapped **Game**.

### <a name="View1">View1</a>

Abstract class for views that wrap a single object of a specified type. The **M** (for model) type parameter indicates the wrapped type. E.g. **GameView** wraps a **Game**, hence the **M** type argument is **Game**.

### <a name="View2">View2</a>

Abstract class for views that wrap two objects of specified types **M1** and **M2**.

### <a name="GameView">GameView</a> and <a name="TaskView">TaskView</a>

Wrappers for **Game** and **Task**, respectively.

### <a name="App">App</a>

**App** is an abstract and generic root container class, you use it to refer a root model object (of type M) and several views (of type View1<U, M>) wrapping the same model object.

### <a name="GameApp">GameApp</a>, <a name="GameView">GameView</a> and <a name="TaskView">TaskView</a>

Wrappers for **Game** and **Task**, respectively, i.e. purpose 1). A **GameView** contains a number of **TaskView**s, typically those that the corresponding **Player** may perform. **GameApp** is a root container for **GameView**s (and hence **TaskView**s), with a reference to the **Game** the **GameView**s wrap.

### <a name="MapView">MapView</a>

A **MapView** stores the UI state of some map UI widget for the game environment, i.e. purpose 2). This includes the panning and zoom state, and a set of **MapMarker**s, i.e. locations that should be shown in the map.
