1. Setup steps :
- Create new maven project with IntelliJ
- Add dependencies :
   <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.141.59</version>
        </dependency>
    </dependencies>
- Create java class name WebDemo
2. Assumptions :
- Case 1 : Login successfully
Pass when check the visibility of button Add Note
- Case 2 : Create new note
Pass when navigating to page My Note after input valid value to Title and Description then click button Add Note