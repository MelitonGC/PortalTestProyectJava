<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FormaConsulta</title>
</head>
<s:head />
<sx:head />
<body>

	<sx:tabbedpanel id="formConsulta">
		<sx:div label="FORM CONSULTA">
			<table>
				<tr>
					<th>ID</th>
					<th>NOMBRE</th>
					<th>PRECIO</th>
					
				</tr>
				<s:iterator value="listProducto">
					<tr>
						<td><s:property value="id" /></td>
						<td><s:property value="nombre" /></td>
						<td><s:property value="precio" /></td>
						
					</tr>
				</s:iterator>
			</table>

		</sx:div>
	</sx:tabbedpanel>

</body>
</html>