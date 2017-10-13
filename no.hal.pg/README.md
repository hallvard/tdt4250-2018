# The no.hal.pg Pervasive Game framework

## Introduction

no.hal.pg is a small OSGi-based framework for location-oriented games that consists of fairly independent steps, or tasks, that the players perform. The frameworks consists of several Ecore models that you build upon, when implementing your game. In addition, it contains web server and client support, for the game's web UI.

## Organisation of the framework

The framework's code is organized as is typical for Eclipse projects:
- bundles - the bundles containing models and web support
- tests - the test bundles
- features - feature projects
- releng - projects for release engineering
