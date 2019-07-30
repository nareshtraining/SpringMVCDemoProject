<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<body>
<form:form action="processForm" modelAttribute="student">

FirstName: <form:input path="firstName"/> <br><br>
LastName: <form:input path="lastName"/> <br><br>

Country: <form:select path="country">
<form:option value="Brazil" label="Brazil"/>
<form:option value="France" label="France"/>
<form:option value="Germany" label="Germany"/>
<form:option value="India" label="India"/>

</form:select>
 <br> <br>
Favorite Language  :  <br><br>

Java<form:radiobutton path="favoriteLanguage" value="Java"/>
.Net<form:radiobutton path="favoriteLanguage" value=".Net"/>
python<form:radiobutton path="favoriteLanguage" value="python"/>

<br><br>

Operating Systems : <br><br>
Linux <form:checkbox path="operatingSystems" value="Linux"/>
MacOS <form:checkbox path="operatingSystems" value="MacOS"/>
Windows <form:checkbox path="operatingSystems" value="Windows"/>

<br><br>
<input type ="submit" value="Submit"/>
</form:form>

</body>

</html>