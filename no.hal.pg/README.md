# The no.hal.pg Pervasive Game framework

## Introduction

no.hal.pg is a small OSGi-based framework for location-oriented games that consists of fairly independent steps, or tasks, that the players perform. The frameworks consists of several Ecore models that you build upon, when implementing your game. In addition, it contains web server and client support, for the game's web UI.

## Organisation of the framework

The framework's code is organized as is typical for Eclipse projects:
- [bundles](bundles/) - the bundles containing models and web support
- [tests](tests/) - the test bundles
- [features](features/) - feature and repository projects for p2 update site 
- [releng](releng/) - projects for release engineering

## Building the framework

Maven is used for building, and since the modules are OSGi bundles and Eclipse projects, they are configured to use Tycho. The organization is based on this article: http://blog.vogella.com/2015/12/15/pom-less-tycho-builds-for-structured-environments/. The modules have Tycho-specific packaging, like eclipse-plugin, eclipse-test-plugin, eclipse-feature, eclipse-repository and eclipse-target-definition (see https://wiki.eclipse.org/Tycho/Packaging\_Types), and to allow so-called POM-less modules, where the module meta-data is derived from the OSGi MANIFEST.MF file, we follow naming conventions described in https://wiki.eclipse.org/Tycho/Release\_Notes/0.24#POM-less_Tycho_builds.
