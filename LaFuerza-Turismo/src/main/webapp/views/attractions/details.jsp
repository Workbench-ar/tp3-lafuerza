<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<jsp:include page="/partials/head.jsp"></jsp:include>


<link href="/LaFuerza-Turismo/assets/css/guestAttraction.css"
	rel="stylesheet" />


</head>

<body>

	<jsp:include page="/partials/login-modal.jsp"></jsp:include>
	<jsp:include page="/partials/navGuest.jsp"></jsp:include>

	<c:choose>
		<c:when test="${lado=='LADO OSCURO'}">
			<jsp:include page="/partials/sidebarDark.jsp"></jsp:include></c:when>
		<c:otherwise><jsp:include
				page="/partials/sidebarLight.jsp"></jsp:include>
		</c:otherwise>
	</c:choose>


	<div id="main"
		class="px-0  <c:choose><c:when test="${lado=='LADO OSCURO'}">themeOscuro</c:when></c:choose>">


		<div
			class="h-100 d-flex justify-content-center align-items-center px-5 py-3">
			<div class="col-md-7 my-4  me-auto">
				<img
					src="/LaFuerza-Turismo/assets/img/attractions/details/<c:out value="${attraction.id}"></c:out>.jpeg"
					alt="..." class="img-fluid">
			</div>

			<div class="col-md-4 me-auto">
				<div class="d-flex flex-row mb-3">
					<div class="col-md-3">
						<img class="col-8"
							<c:choose><c:when test="${lado=='LADO OSCURO'}"> src="/LaFuerza-Turismo/assets/img/home/dark-grey.png"</c:when>
		<c:otherwise>src="/LaFuerza-Turismo/assets/img/home/light.png"</c:otherwise></c:choose>>


					</div>
					<div class="col-md-9 align-self-center me-auto">
						<h3>
							<c:out value="${attraction.name}"></c:out>
						</h3>

					</div>

				</div>
				<div>
					<p class="text-star">${attraction.descripcion}</p>
				</div>
				<div
					class="d-flex flex-row mb-3 justify-content-around align-items-center mt-5">
					<div
						class="col-md-3 fondoTransparente<c:choose><c:when test="${lado=='LADO OSCURO'}">Dark</c:when></c:choose>  rounded iconos text-center py-3">${attraction.cost}</div>
					<div
						class="col-md-3 fondoTransparente<c:choose><c:when test="${lado=='LADO OSCURO'}">Dark</c:when></c:choose>  rounded iconos text-center py-3">${attraction.duration}</div>
				</div>
			</div>

		</div>

		<div class="mx-5 pb-4">
			<form method="get" action="guest">
				<button type="submit" class="btn btn-secondary" value="${lado}"
					name="lado">Volver</button>
			</form>
		</div>

	</div>


	<footer>
		<jsp:include page="/partials/footer.jsp"></jsp:include>
	</footer>




</body>
</html>