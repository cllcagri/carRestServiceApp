# carRestServiceApp
Created car restful service in spring boot
#Step 1
Created a car_info.txt file under resources root pack.

#Step 2 
Created Model class with given properties in car_info file.

#Step 3
Creating packages inside src folder.
Service and Dao classes have interfaces to implements.
Also connect each others with @Autowired annotation.
Dao class normally take @Repository annotation when connect with Database.
So we are using from txt and I used @Component annotation.
Used service class for searching and elimination.

#Step 4
Creating RestController to response data.
Used @RestController instead of @Controller annotation.
Because we serve direct data like JSON, XML.
Also used @RequestMapping and @RequestParam annoatitions for getting data from URL.

#Step5
When build and run project in local call rest service from URL below:
http://localhost:8080/searchRest?searchCriteria=hepsi&key=OTo 

#Step6
We can test this URL using Postman App (https://www.postman.com)
Create new request and paste url and send.
We can see the data in the format what we want.

Thanks!

