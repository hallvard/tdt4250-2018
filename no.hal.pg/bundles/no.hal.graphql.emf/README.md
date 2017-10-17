# The no.hal.graphql.emf project

## Introduction

[GraphQL](http://graphql.org/) is a query language for domain data, based on the [JSON](http://json.org) syntax. It can support many data models, as long as it can be mapped to JSON and GraphQL's types and schema (see http://graphql.org/learn/schema/). Simply put, a GraphQL query is a JSON template that is filled in by the query engine with real data.

This project provides a mapping from Ecore to GraphQL's schema and supports using EMF data as a data source for answering queries, based on the [graphql-java engine](https://github.com/graphql-java/graphql-java). Basically, all Ecore classes (**EClasses**) are mapped to both a GraphQL interface and object type. The interface is used for inheritance, an object type implements all the interfaces of its supertypes (and its own one).

## Usage

To create a schema you must provide a set of **EPackage**s, and the schema will include all the **EClass**es of these **EPackage**s.

See the [no.hal.graphql.emf.tests project](../../tests/no.hal.graphql.emf.tests) for examples of how it is used.
