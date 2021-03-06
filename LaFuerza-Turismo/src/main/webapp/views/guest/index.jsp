<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<jsp:include page="/partials/head.jsp"></jsp:include>

<link href="/LaFuerza-Turismo/assets/css/guest.css" rel="stylesheet" />


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
		<header
			class="<c:choose><c:when test="${lado=='LADO OSCURO'}"> oscuro</c:when><c:otherwise>luminoso </c:otherwise></c:choose>"
			id="header"> </header>



		<div class="container mt-5 py-4 px-5  rounded" id="fondo-cards">
			<div class="row m-4">
				<div class="col-2">
					<img class="icono"
						<c:choose><c:when test="${lado=='LADO OSCURO'}"> src="/LaFuerza-Turismo/assets/img/home/dark.png"</c:when>
		<c:otherwise>src="/LaFuerza-Turismo/assets/img/home/light.png"</c:otherwise></c:choose>>
				</div>
				<div class="col-8">
					<p class="text-center"
						<c:choose><c:when test="${lado=='LADO OSCURO'}">text-white</c:when></c:choose>>Algun
						texto explicando de que se trata el parque, que puede hacer atc
						teAlgun texto explicando de que se trata el parque, que puede
						hacer atc teAlgun texto explicando de que se trata el parque, que
						puede hacer atc asdfasdfa adsf asdf asdf d dsfasdfasd dasdf asd
						asdfsdfsdfadddasddd asd asdf t</p>
				</div>
			</div>

			<div class="row pb-4">
				<c:forEach items="${attractions}" var="attraction" begin="1" end="3">
					<div class="col-sm-4">
						<div
							class="card <c:choose><c:when test="${lado=='LADO OSCURO'}"> border-dark</c:when></c:choose> ">
							<img class="card-img-top"
								src="/LaFuerza-Turismo/assets/img/attractions/cards/<c:out value="${attraction.id}"></c:out>.jpeg"
								alt="Card image cap">
							<div
								class="card-body  <c:choose><c:when test="${lado=='LADO OSCURO'}"> text-white-50 bg-dark</c:when></c:choose>">
								<h5 class="card-title">
									<c:out value="${attraction.name}"></c:out>
								</h5>
								<p class="card-text">"${attraction.descripcion}"</p>

								<form method="get" action="atracction">
									<button type="submit" class="btn btn-secondary"
										value="${attraction.id}" name="attractionID">Info</button>
								</form>





							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>



		<div class="d-flex justify-content-center bd-highlight ">
			<div class="py-4">
				<form method="GET" action="guest">
					<button type="submit"
						class="btn fondoTransparente rounded btn-lg m-4 cambiarLado"
						value=<c:choose><c:when test="${lado=='LADO OSCURO'}"> "Lado Luminoso"</c:when>
		<c:otherwise>"Lado Oscuro"</c:otherwise></c:choose>
						name="lado">CAMBIAR DE LADO</button>

				</form>
			</div>
		</div>

	</div>




	<footer>
		<jsp:include page="/partials/footer.jsp"></jsp:include>
	</footer>



</body>
</html>
