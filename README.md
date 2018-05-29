# vehicle-repository

Operations: 
1) 
URI: http://localhost:8080/vehicles
Request Method: GET
Response:

{
"_embedded": {
"vehicles": [
  {
"name": "new",
"type": "new",
"_links": {
"self": {
"href": "http://localhost:8080/vehicles/1"
},
"vehicle": {
"href": "http://localhost:8080/vehicles/1"
}
}
},
  {
"name": "Honda",
"type": "Car",
"_links": {
"self": {
"href": "http://localhost:8080/vehicles/101"
},
"vehicle": {
"href": "http://localhost:8080/vehicles/101"
}
}
},
  {
"name": "Ford",
"type": "Truck",
"_links": {
"self": {
"href": "http://localhost:8080/vehicles/102"
},
"vehicle": {
"href": "http://localhost:8080/vehicles/102"
}
}
},
  {
"name": "Boeing",
"type": "Airplane",
"_links": {
"self": {
"href": "http://localhost:8080/vehicles/103"
},
"vehicle": {
"href": "http://localhost:8080/vehicles/103"
}
}
},
  {
"name": "Amphibian",
"type": "Amphibian",
"_links": {
"self": {
"href": "http://localhost:8080/vehicles/104"
},
"vehicle": {
"href": "http://localhost:8080/vehicles/104"
}
}
},
  {
"name": "Boat",
"type": "Boat",
"_links": {
"self": {
"href": "http://localhost:8080/vehicles/105"
},
"vehicle": {
"href": "http://localhost:8080/vehicles/105"
}
}
}
],
},
"_links": {
"self": {
"href": "http://localhost:8080/vehicles{?page,size,sort}",
"templated": true
},
"profile": {
"href": "http://localhost:8080/profile/vehicles"
}
},
"page": {
"size": 20,
"totalElements": 6,
"totalPages": 1,
"number": 0
}
}


2) 
http://localhost:8080/vehicles
Request Method: POST
Request Body:
{

  "name": "new",
  "type": "car"
}

3) 
URI: http://localhost:8080/vehicles/1
Request Method:PUT
Content-Type - application/json
Request Body:
{
  "name": "new",
  "passportNumber": "car"
}

4) 
URI: http://localhost:8080/students/1
Request Method: DELETE
Response:
Vehicle 1 is deleted.
