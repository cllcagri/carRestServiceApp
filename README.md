# CarRestServiceApp
Created car restful service in spring boot  <br/>
##### Step 1
Created a car_info.txt file under resources root pack.<br/>
Created Model class with given properties in car_info file.<br/>

##### Step 2
Creating packages inside src folder.<br/>
Service and Dao classes have interfaces to implements.<br/>
Also connect each others with **@Autowired** annotation.<br/>
Dao class normally take **@Repository** annotation when connect with Database.<br/>
So we are using from txt and I used **@Component** annotation.<br/>
Used service class for searching and elimination.<br/>

##### Step 3
Creating RestController to response data. <br/>
Used **@RestController** instead of **@Controller** annotation. <br/>
Because we serve direct data like JSON, XML. <br/>
Also used @RequestMapping and **@RequestParam** annoatitions for getting data from URL.<br/>

##### Step 4
When build and run project in local call rest service from URL below: <br/>
`http://localhost:8080/searchRest?searchCriteria=hepsi&key=OTo`

##### Step 5
We can test this URL using [Postman App] (https://www.postman.com) <br/>
Create new request and paste url and send. <br/>
We can see the data in the format what we want. <br/>

The End!

