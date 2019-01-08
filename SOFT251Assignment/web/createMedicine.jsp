<%-- 
    Document   : createMedicine
    Created on : 07-Jan-2019, 16:00:35
    Author     : Daniel Richards
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Medicine</title>
    </head>
    <body>
        <form action="CreateMedicineServlet">
            Medicine ID: <input type="text" name="medicineID">
            Medicine Name: <input type="text" name="medicineName">
            Medicine Quantity: <input type="text" name="medicineQty">
            <input type="submit" value="Create Medicine">
        </form>
    </body>
</html>
