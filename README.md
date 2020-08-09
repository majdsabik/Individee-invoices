**Instructions:**\
The code can be executed by running 

.\\mvnw spring-boot:run

or

.\\mvnw.cmd spring-boot:run

on Windows.\
The code has 3 endpoints:

1.  [[http://localhost:8080/invoice]{.ul}](http://localhost:8080/invoice) lists
    > the details of all the invoices in the database in JSON format.

2.  [[http://localhost:8080/invoice/\${id}]{.ul}](http://localhost:8080/invoice/$%7Bid%7D) lists
    > the details of selected invoice in JSON format.

3.  [[http://localhost:8080/invoice/download/\${id}]{.ul}](http://localhost:8080/invoice/download/$%7Bid%7D) downloads
    > the PDF file embedded in the database for the selected invoice.
