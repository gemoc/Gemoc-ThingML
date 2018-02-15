# Gemoc-ThingML

Execute ThingML models within Gemoc Studio.

## Bootstrapping

After cloning, run the following command to fetch submodules:

```bash
git submodule update --init --depth 1 --recursive
```

Go in the ThingML submodule and generate ecore model (you will need maven
installed).  
Don't worry if the build fails during the `ThingML :: Language :: Model` goal.

```bash
cd ThingML
mvn clean install
```

Import the following Existing Projects into your Language Workspace:

- `/ThingML/language/thingml`
- `/ThingML/language/thingml.ui`

Once it is done, you can import the projects from the language folder.
