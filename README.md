1.Implement a logging system that will record events in the file logs.txt 
(log events: servlet initialization, request processing, servlet destruction).

2.Develop a new servlet that will handle requests at the address /logs. 
This servlet should read the contents of the file logs.txt and display it in the browser in a readable format.

3.Create servlets for the application from Homework Assignment 22.
The servlets should return a page about you or your goals (make sure logging is set up in the servlets).

3.Define configuration parameters in the web.xml file.
Parameters: appName, appVersion, developerName, supportEmail.
Create a servlet that will extract these parameters from web.xml and display them in the browser when navigating to /settings.

5.Create a servlet that, when navigating to /count, will print the number of visits to this page. 
Use the Session mechanism.

6.Add the ability to reset the visit counter. 
This should be implemented through a separate URL (/reset), which resets the number of visits to the /count page.
