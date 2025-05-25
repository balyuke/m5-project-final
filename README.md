## [REST API](http://localhost:8080/doc)

```
  url: jdbc:postgresql://localhost:5432/jira
  username: jira
  password: JiraRush
```

<h2>List of completed tasks:</h2>

<p>&#10004;&#65039; 1. Understand the project structure (onboarding).</p>
<img src="resources/images/JiraRush-00-1-ConfigDocker.png"/>
<div align="center"><b>Run Docker</b></div>
<br>
<img src="resources/images/JiraRush-00-2-FirstRunning.png"/>
<div align="center"><b>First running app</b></div>
<br>
<img src="resources/images/JiraRush-00-3-AllTestsRunning.png"/>
<div align="center"><b>All Tests Running</b></div>
<br>
<p>&#10004;&#65039; 2. Remove social networks: vk, yandex.</p>
<img src="resources/images/Task_02_1_Before.png"/>
<div align="center"><b>Before</b></div>
<br>
<img src="resources/images/Task_02_2_After"/>
<div align="center"><b>After</b></div>
<br>
<p>&#10004;&#65039; 3. Transfer sensitive information (login, database password, identifiers for OAuth registration/authorization, mail settings) to a separate property file application-secrets.yaml. Put link for that file in .gitignore</p>
<img src="resources/images/Task_03_1_AppSecret.png"/>
<div align="center"><b>Application secret file</b></div>
<br>
<img src="resources/images/Task_03_2_ConfigProd.png"/>
<div align="center"><b>Config prod profile</b></div>
<br>
<img src="resources/images/Task_03_3_ConfigTest.png"/>
<div align="center"><b>Config test profile</b></div>
<br>
<p>&#10004;&#65039; 4. Correct the tests so that during the tests the in memory database (H2) is used, and not PostgreSQL. To do this, you need to define 2 beans, and the selection of which one to use should be determined by the active Spring profile.</p>
<img src="resources/images/Task_04_1_AddDependency.png"/>
<div align="center"><b>Add dependency</b></div>
<br>
<img src="resources/images/Task_04_2_RunningTests.png"/>
<div align="center"><b>All Tests Running</b></div>
<br>
<p>&#10004;&#65039; 5. Write tests for all public methods of the ProfileRestController controller.</p>
<img src="resources/images/Task_05_1_RunProfileRestControllerTests.png"/>
<div align="center"><b>Run ProfileRestController tests</b></div>
<br>