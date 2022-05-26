# FieldMap Plugin
This plugin provides a widget used to select auto options for the 2022 FRC game, Rapid React. This widget also has a custom data type. 

Also included in this repository is a custom theme for shuffleboard. This theme extends shuffleboards 'dark' theme. It is intended to resemble team 1675s colors. 

## To install the plugin:

### You could install the plugin by downloading and building the source: 
1. Download the source code
2. Run `gradlew installPlugin` via:
	- WPILib VS Code: 
		- Open project
		- Open command palette (F1)
		- Type `gradle` and select `WPILib: Run a command in Gradle`
		- Type `installPlugin`
	- Command prompt:
		- Navigate to project directory 
		- Run `gradlew installPlugin`
		- Note that you must have the JAVA_HOME environment variable set
3. Open shuffleboard

### Or by downloading prebuilt jar:
1.  Download the JAR from the Github releases page
2.  Move the jar file into shuffleboards plugins folder, typically located at  `C:\Users\<username>\Shuffleboard\plugins` .
3. Start shuffleboard

## To install the custom theme: 
1. Create a new folder in shuffleboards theme folder, typically located at `C:\Users\<username>\Shuffleboard\themes` . The folder can be named whatever you like. 
2. Drop the css file into the newly created folder
3. Start shuffleboard
4. Open the preferences menu (File -> Preferences) and select the theme from the dropdown menu. The theme will have the same name as the folder you created previously. 