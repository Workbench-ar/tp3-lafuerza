<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link href="/LaFuerza-Turismo/assets/css/navguest.css" rel="stylesheet" />

<nav id="menu" class="navbar  fixed-top  shadow <c:choose><c:when test="${lado=='LADO OSCURO'}"> navbar-dark bg-dark</c:when>
		<c:otherwise>navbar-light bg-light </c:otherwise></c:choose>" >



	<button data-bs-toggle="offcanvas" data-bs-target="#offcanvas" role="button" class="openbtn px-3<c:choose><c:when test="${lado=='LADO OSCURO'}"> btn btn-dark text-secondary</c:when>
		<c:otherwise>btn btn-light </c:otherwise></c:choose>" >☰ Menu</button>
		
	<!-- 	  <button class="btn float-end" data-bs-toggle="offcanvas" data-bs-target="#offcanvas" role="button">
                <i class="bi bi-arrow-right-square-fill fs-3" data-bs-toggle="offcanvas" data-bs-target="#offcanvas"></i>
            </button> -->
            
 <%--            
	<button class="openbtn px-3<c:choose><c:when test="${lado=='LADO OSCURO'}"> btn btn-dark text-secondary</c:when>
		<c:otherwise>btn btn-light </c:otherwise></c:choose>" onclick="openNav()">☰ Menu</button> --%>


	<ul class="nav navbar-nav navbar-center">
		<span class="navbar-text fs-4"> <c:out value="${lado}"></c:out></span>
	</ul>
	<form class="form-inline my-2 my-lg-0 px-3">
		<button type="button" class="btn btn-outline-secondary my-2 my-sm-0"
			data-bs-toggle="modal" data-bs-target="#modalForm">Login</button>
	</form>



</nav>