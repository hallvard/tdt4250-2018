# The no.hal.pg.bundles folder

## Introduction

This folder contains the bundles for the functional elements of the framework. 

## Organisation of the framework

The bundles fall into three categories: models, (generic and specific) web support, and Eclipse UI bundles useful during development and testing.

### Model bundles
- [no.hal.pg.runtime](no.hal.pg.runtime/) - The generic game model, centered around game tasks that the players must perform.
- [no.hal.pg.arc](no.hal.pg.arc/) - A model for authorization, based on capabilities that groups and people explicitly have themselves, or indirectly through roles. However, the only class currently used is [Person](no.hal.pg.arc/#Person), that [Player](no.hal.pg.runtime/#Player) refers to.
- [no.hal.pg.osm](no.hal.pg.osm/) - A model of data from Open Street Map, for supporting location-oriented game tasks.
- [no.hal.pg.config](no.hal.pg.config/) - A model for configuring or setting up a game. From an instance of this model you get the initial runtime state of a game, means there needs to be UI support for authoring config models. 

### Web bundles
- [no.hal.pg.http](no.hal.pg.http/) - Generic support for accessing model instances using REST-like paths and GraphQL querries, and for providing web apps for model objects.
- [no.hal.graphql.emf](no.hal.graphql.emf/) - Generic GraphQL support for EMF, albeit a prototype at this moment.
- [no.hal.pg.runtime.http](no.hal.pg.runtime.http/) - Web app for the game model.

### UI bundles
- [no.hal.pg.ui](no.hal.pg.ui/) - Views supporting the development and testing of game models and web clients.
- [no.hal.pg.osm.geomap](no.hal.pg.osm.geomap/) - View based on the Nebula geomap widget, that shows geo-locations in model instances on a map.
