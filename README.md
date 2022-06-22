# SpringBoot-App

POST   http://localhost:8080/createresource
{
    "firstName": "rishu",
    "lastName": "goyal",
    "email": "rishu@abc.com",
    "courses":[
        {
            "name": "flutter",
            "description": "flutter",
            "email": ""
        },
        {
            "name": "spring",
            "description": "spring",
            "email": ""
        }
    ]
}

GET http://localhost:8080/readresources
GET http://localhost:8080/readresource/rishu@abc.com 

POST http://localhost:8080/updateresource
{
    "firstName": "rishu",
    "lastName": "garg",
    "email": "rishu@abc.com",
    "courses":[
        {
            "name": "flutter",
            "description": "flutter",
            "email": ""
        },
        {
            "name": "spring",
            "description": "spring",
            "email": ""
        }
    ]
}

DELETE http://localhost:8080/deleteresource/rishu@abc.com
