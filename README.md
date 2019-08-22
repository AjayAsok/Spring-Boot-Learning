# Spring-Boot-Learning
This is a springboot maven starter application. I have used Java version 8 and STS tool for development purposes
## Steps
1. Open STS tool and creat a new maven project.
2. Open the POM.xml file and add the following.
 a. We need to add parent as below
 <parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.4.2.RELEASE</version>
	</parent>
 b. Add the below dependancy
    <dependencies>  
    <dependency>  
        <groupId>org.springframework.boot</groupId>  
        <artifactId>spring-boot-starter-web</artifactId>  
    </dependency>  
</dependencies>  
 c. Add Java Version property.
    <properties>
		<java.version>1.8</java.version>
	  </properties>
   
3. Create a new package inside src/main/java
4. Inside the new package, create a new class file, let's say SampleApplication.
5. Provide @SpringBootApplication for the class.
6. Create a main method inside the class.
7. Call the run() method inside SpringApplication.
   SpringApplication.run(<YourClassName>.class, args);
8. Now your app is ready, you can right click on the class, then runas java application.
That's it, you are saying hi to the springboot world :P
