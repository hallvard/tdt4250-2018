# The no.hal.pg.releng folder

## Introduction

This folder contains the following projects related to release engineering (releng):

- [no.hal.pg.aggregator](no.hal.pg.target/) - The *target* project listing all bundles that will be part of the platform upon which the game and development support will run. The target is defined using the [tpd format](https://github.com/mbarbero/fr.obeo.releng.targetplatform), that supports modularizing the target definition and helps filling in the versions available in the referenced repositories.
- [no.hal.pg.aggregator](no.hal.pg.repository/) - p2 repository project listing the features that will be available in the genreated update site.
- [no.hal.pg.aggregator](no.hal.pg.aggregator/) - The *maven* project used for building the project. It lists all the projects (*modules* in maven terminology), of all categories (bundles, tests, features and repositories).
