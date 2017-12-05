<html>

<head>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<style type="text/css">
table {
	position: relative;
	top: 200px;
	left: 500px;
	right: 500px;
	bottom: 500px;
}
</style>

</head>

<body>
	<font color="red">${errorMessage}</font>
	<form:form method="post" modelAttribute="deviceForm">
		<table>
			<tbody>
				<tr>
					<td>Node Name</td>
					<td><form:input type="text" path="nodeName"
							placeholder="nodeName" autofocus="true"></form:input> <!-- 					
							<input type="text" name="nodeName" /> --></td>
				</tr>

				<tr>
					<td>Device Ip Address</td>
					<td><form:input type="text" path="deviceIp"
							placeholder="deviceIp" autofocus="true"></form:input></td>

				</tr>
				<tr>
					<td>Terminal Ip Address</td>
					<td><form:input type="text" path="terminalIpAddres"
							placeholder="terminalIpAddres" autofocus="true"></form:input>
				</tr>
				<tr>
					<td>Port</td>
					<td><form:input type="text" path="port" placeholder="port"
							autofocus="true"></form:input>
				</tr>
				<tr>
					<td>Device Name</td>
					<td><form:input type="text" path="deviceName"
							placeholder="deviceName" autofocus="true"></form:input></td>
				</tr>
				<tr>
					<td>Device Description</td>
					<td><form:input type="text" path="deviceDescription"
							placeholder="deviceDescription" autofocus="true"></form:input>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td align="center" colspan="3"><input type="submit" /></td>
				</tr>
			</tbody>
		</table>


	</form:form>
</body>

</html>