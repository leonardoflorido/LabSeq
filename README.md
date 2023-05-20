# LabSeq

Web application for retrieving values from the labseq sequence.

## Installation

Clone the repository:

```console
$ git clone git@github.com:leonardoflorido/LabSeq.git
```

## How To Run (Docker)

Run the following command:

```console
$ docker-compose up
```

Note:

- If [Docker](https://www.docker.com/) is not installed, please install it or follow the steps below.

## Prerequisites

To run the project, the following software must be installed on the system:

- [Node.js](https://nodejs.org/en/) (v18 or higher)
- [Java](https://www.oracle.com/java/) (v17)
- [Maven](https://maven.apache.org/) (v3.9.0 or higher)

## Requirements

Install requirements:

- Inside the `frontend` folder, run:

 ```console
 $ npm install
 ```

## How To Run

Run the following commands in two separate terminals:

1. Inside the `backend` folder, run:

```console
$ mvn spring-boot:run
```

2. Inside the `frontend` folder, run:

```console
$ npm start
```

## Bookmarks

- Link to the [Web Application](http://localhost:4200/)
- Link to the [API Documentation](http://localhost:8080/swagger-ui/index.html#/)

Note:

- To view the API documentation, the backend must be running.