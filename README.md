# fact-spring
A demo of spring boot project with REST API 
1. ./gradlew clean build 
2. ./gradlew bootRun

3. curl --location --request GET 'localhost:8081/aastha/fact' \

--form 'animal="cat"'



4. curl --location --request GET 'localhost:8081/aastha/fact' \

--form 'animal=“dog”’

5. curl --location --request POST 'localhost:8081/authenticate' \
--header 'Content-Type: application/json' \
--data-raw '{
    "username":"chatment",
    "password":"password"
}' 
Copy the token value in the response 

6 .curl --location --request GET 'localhost:8081/aastha/find' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJjaGF0bWVudCIsImV4cCI6MTY1NTcyNzEwMSwiaWF0IjoxNjU1NzA5MTAxfQ.papTL87zXoTKIyceyBF5uQ4dhTXh7hgQCwwqC7u_ogrM1PXypS8l0zFfywOt6mSkNB7N8RVOx5DdZomonotlTw'

Replace the text after Bearer with token received in step 5.
