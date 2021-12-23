<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FormCatalogo</title>
</head>
<s:head />
<sx:head />
<body>
	<sx:tabbedpanel id="formCatalogo">
		<sx:div label="CATALOGO NOMBRES">
			<s:select name="nombre" label="NOMBRE" list="nombresProductos"
				headerkey="1" />
			<sx:autocompleter name="nombre" label="PRECIO" list="nombresProductos" />
		</sx:div>
	</sx:tabbedpanel>

</body>
</html>