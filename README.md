<!-- ######## This is a comment, visible only in the source editor  ######## -->
<h1 style="color: #4485b8;"><!-- ######## This is a comment, visible only in the source editor  ######## --></h1>
<p><strong>Instructions:</strong><br /> The code can be executed by running&nbsp;<code>.\mvnw spring-boot:run</code>&nbsp;(<code>.\mvnw.cmd spring-boot:run</code> on Windows).<br /> The code has 3 endpoints:</p>
<ol>
<li><a href="http://localhost:8080/invoice">http://localhost:8080/invoice</a> lists the details of all the invoices in the database in JSON format.</li>
<li><a href="http://localhost:8080/invoice/$%7Bid%7D">http://localhost:8080/invoice/${id}</a> lists the details of selected invoice in JSON format.</li>
<li><a href="http://localhost:8080/invoice/download/$%7Bid%7D">http://localhost:8080/invoice/download/${id}</a> downloads the PDF file embedded in the database for the selected invoice.</li>
</ol>
