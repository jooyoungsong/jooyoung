<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link href="https://fonts.googleapis.com/css?family=Roboto:400,100,300,700" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/style.css">
<script nonce="b2bf6158-9902-400c-90aa-701ebdde0e96">(function(w,d){!function(j,k,l,m){j[l]=j[l]||{};j[l].executed=[];j.zaraz={deferred:[],listeners:[]};j.zaraz.q=[];j.zaraz._f=function(n){return async function(){var o=Array.prototype.slice.call(arguments);j.zaraz.q.push({m:n,a:o})}};for(const p of["track","set","debug"])j.zaraz[p]=j.zaraz._f(p);j.zaraz.init=()=>{var q=k.getElementsByTagName(m)[0],r=k.createElement(m),s=k.getElementsByTagName("title")[0];s&&(j[l].t=k.getElementsByTagName("title")[0].text);j[l].x=Math.random();j[l].w=j.screen.width;j[l].h=j.screen.height;j[l].j=j.innerHeight;j[l].e=j.innerWidth;j[l].l=j.location.href;j[l].r=k.referrer;j[l].k=j.screen.colorDepth;j[l].n=k.characterSet;j[l].o=(new Date).getTimezoneOffset();if(j.dataLayer)for(const w of Object.entries(Object.entries(dataLayer).reduce(((x,y)=>({...x[1],...y[1]})),{})))zaraz.set(w[0],w[1],{scope:"page"});j[l].q=[];for(;j.zaraz.q.length;){const z=j.zaraz.q.shift();j[l].q.push(z)}r.defer=!0;for(const A of[localStorage,sessionStorage])Object.keys(A||{}).filter((C=>C.startsWith("_zaraz_"))).forEach((B=>{try{j[l]["z_"+B.slice(7)]=JSON.parse(A.getItem(B))}catch{j[l]["z_"+B.slice(7)]=A.getItem(B)}}));r.referrerPolicy="origin";r.src="/cdn-cgi/zaraz/s.js?z="+btoa(encodeURIComponent(JSON.stringify(j[l])));q.parentNode.insertBefore(r,q)};["complete","interactive"].includes(k.readyState)?zaraz.init():j.addEventListener("DOMContentLoaded",zaraz.init)}(w,d,"zarazData","script");})(window,document);</script>

<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu:wght@700&family=Nanum+Pen+Script&family=Single+Day&display=swap&family=Permanent+Marker&display=swap" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
<style>
		.imgbox{
			width: 100%;
			height:500px;
			overflow:hidden;
			margin:200px auto;
		}
		
		.videoth{
			width:100%;
			height: 500px;
			object-fit: cover;
		}
		
 .gaipbtn:hover{
 	cursor:pointer;
}

 .gaipbtn{
 	margin-left: 1450px;
 }

.togglebtn{
	cursor:pointer;
	margin-left: 1730px;
	margin-bottom: -22px;
	
}
input{
	position: absolute; left:-1000%;
}

label {
	display: block; position:relative; width:50px; height:20px; background:#d3d3d3;
	border-radius:25px; transition: background: 0.4s;
}

label:after
{content: ""; position:absolute; left:2.5px; top:28%; width:14px; height:13px;
border-radius:100%; background:#fff; transform:translateY(-25%); box-shadow:1px 3px 4px rgba(0,0,0,1);
background: 0.4s;}

input:checked + label{ background:#f1bc31;}
input:checked + label:after{ left:inherit; right:2.5px;}


/*  label span{display:none;}*/

</style>
</head>
<body>
<div class="p-5 bg-white text-black text-center" style="height:290px; padding:10px;">
 
  <div>
  
  	<div style="text-align: right; margin-right: 90px; color:gray;">
  	
  				<input type="checkbox" id="chk1">
  					<label for="chk1" class="togglebtn">
  						
  					</label>
  				admin
  		
  	</div>
  
  	<div style="font-size:0.8em; width: 500px" class="gaipbtn">
  		<a>LOGIN</a>&nbsp;&nbsp;&nbsp;&nbsp;
  		<a>JOIN</a>&nbsp;&nbsp;&nbsp;&nbsp;
  		<a>SEARCH</a>
  	</div>
 
  </div>
  <br>
  
  <div style="margin:auto;">
  	<div style="margin-left:1px;">
  		<h1 style="font-family:Permanent Marker; font-size:4em;"><img src='../carimage/machine.png' width='80px'; height='80px';>&nbsp;SevenMotors<h1>
  	</div>
  <h6>Welcome to SevenMotors. <br>Leave it to us and we'll do our best.</h6> 
  </div>

</div>

<div class="wrap">
			<div class="container">
				<div class="row justify-content-between">
					<div class="col">
						<p class="mb-0 phone">
							<span class="fa fa-phone"></span> <a href="#">+00 1234 567</a>
						</p>
					</div>
					<div class="col d-flex justify-content-end">
						<div class="social-media">
							<p class="mb-0 d-flex">
								<a href="#"
									class="d-flex align-items-center justify-content-center"><span
									class="fa fa-facebook"><i class="sr-only">Facebook</i></span></a> <a
									href="#"
									class="d-flex align-items-center justify-content-center"><span
									class="fa fa-twitter"><i class="sr-only">Twitter</i></span></a> <a
									href="#"
									class="d-flex align-items-center justify-content-center"><span
									class="fa fa-instagram"><i class="sr-only">Instagram</i></span></a>
								<a href="#"
									class="d-flex align-items-center justify-content-center"><span
									class="fa fa-dribbble"><i class="sr-only">Dribbble</i></span></a>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		
	<!--상단바 아래 흰 배경  -->	
		<nav
			class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light"
			id="ftco-navbar">
			<div class="container">
				<a class="navbar-brand" href="indexPage.jsp">SEVEN motors<span></span></a>
				<form action="#" class="searchform order-sm-start order-lg-last">
					<div class="form-group d-flex">
						<input type="text" class="form-control pl-3" placeholder="Search">
						<button type="submit" placeholder class="form-control search">
							<span class="fa fa-search"></span>
						</button>
					</div>
				</form>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#ftco-nav" aria-controls="ftco-nav"
					aria-expanded="false" aria-label="Toggle navigation">
					<span class="fa fa-bars"></span> Menu
				</button>
				<div class="collapse navbar-collapse" id="ftco-nav">
					<ul class="navbar-nav m-auto">
						<li class="nav-item active"><a href="#" class="nav-link">Home</a></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="dropdown04"
							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Page</a>
							<div class="dropdown-menu" aria-labelledby="dropdown04">
								<a class="dropdown-item" href="#">Page 1</a> <a
									class="dropdown-item" href="#">Page 2</a> <a
									class="dropdown-item" href="#">Page 3</a> <a
									class="dropdown-item" href="#">Page 4</a>
							</div></li>
						<li class="nav-item"><a href="#" class="nav-link">Catalog</a></li>
						<li class="nav-item"><a href="#" class="nav-link">Blog</a></li>
						<li class="nav-item"><a href="#" class="nav-link">Contact</a></li>
					</ul>
				</div>
			</div>
		</nav>

<div class="imgbox">
<div>
	
		<div id="carouselExampleIndicators" class="carousel slide">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
  </div>
  <div class="carousel-inner">
    <div class="carousel-item active">
        <video muted autoplay playsinline class="videoth">
					<source src="https://nexen-front.s3.amazonaws.com/video/keyvisual_02230614.mp4" type="" />
				</video>
    </div>
    <div class="carousel-item">
        <video muted autoplay playsinline class="videoth">
					<source src="https://nexen-front.s3.ap-northeast-2.amazonaws.com/kr/kr_02.mp4" type="" />
				</video>
    </div>
    <div class="carousel-item">
       <video muted autoplay playsinline class="videoth">
					<source src="https://nexen-front.s3.ap-northeast-2.amazonaws.com/kr/kr_03.mp4" type="" />
				</video>
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
  
</div>
</div>

<div class="navbar navbar-expand-sm bg-dark navbar-dark" style="font-size:0.8em;">
  <p>고객문의 &nbsp 이용약관 &nbsp 개인정보처리방침</p>
  <hr>
  <b>SevenMotors<b><br><br>
  <p>사업자등록번호 110-11-1023</p>
  <p>대표번호 02-3482-4632</p>
  <p>이메일 문의하기</p>
  <p>고객만족센터 1588-5252</p> 
  <br>
  
  <h5 style="color:gray; font-size:0.5px;">Copyrightⓒ2023 SevenMotors.all rights reserved.</h5>
</div>

	<script src="js/jquery.min.js"></script>
	<script src="js/popper.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/main.js"></script>
	<script defer
		src="https://static.cloudflareinsights.com/beacon.min.js/v8b253dfea2ab4077af8c6f58422dfbfd1689876627854"
		integrity="sha512-bjgnUKX4azu3dLTVtie9u6TKqgx29RBwfj3QXYt5EKfWM/9hPSAI/4qcV5NACjwAo8UtTeWefx6Zq5PHcMm7Tg=="
		data-cf-beacon='{"rayId":"7f7e1263cf2b19e8","token":"cd0b4b3a733644fc843ef0b185f98241","version":"2023.8.0","si":100}'
		crossorigin="anonymous"></script>


</body>
</html>