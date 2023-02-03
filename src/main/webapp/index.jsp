<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
	body {
		margin: 0;
	}
/* This part is the body  */
	.flex {
    display: flex;
    flex-wrap: no-wrap;
    overflow: hidden;
    background: #111;
}
 .hotel {
    opacity: 0;
    animation: blink 5s infinite;
    filter: drop-shadow(0px 0px 10px #ff0dff);
    height: 50%;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translateY(-50%) translateX(-50%);
    animation-timing-function: linear;
}

 @keyframes blink {
    0% {
       opacity: 0;
   }
    22% {
       opacity: 1;
   }
    23% {
       opacity: 1;
   }
    24% {
       opacity: 0;
   }
    25% {
       opacity: 1;
   }
    60% {
       opacity: 1;
   }
    61% {
       opacity: 0;
   }
    62% {
       opacity: 1;
   }
    63% {
       opacity: 0;
   }
    65% {
       opacity: 1;
   }
    66% {
       opacity: 0;
   }
    85% {
       opacity: 1;
   }
}
 html, body, .flex {
    height: 100%;
    width: 100%;
    background: #191D32;
}
/* Nav */
@import url("https://fonts.googleapis.com/css?family=Oswald:500");
 .thx {
    position: fixed;
    left: 50%;
    transform: translateX(-50%);
    bottom: 15px;
}
 nav {
    width: 100%;
    position: fixed;
    top: 30px;
    text-align: center;
}
 nav a {
    font-family: 'Oswald', sans-serif;
    font-weight: 500;
    text-transform: uppercase;
    text-decoration: none;
    color: #9CF6F6;
    margin: 0 15px;
    font-size: 18px;
    letter-spacing: 1px;
    position: relative;
    display: inline-block;
}
 nav a:before {
    content: '';
    position: absolute;
    width: 100%;
    height: 3px;
    background: #9CF6F6;
    top: 40%;
    animation: out 0.2s cubic-bezier(1, 0, 0.58, 0.97) 1 both;
}
 nav a:not(.active):hover:before {
    animation: in 0.2s cubic-bezier(1, 0, 0.58, 0.97) 1 both;
}

nav a:last-child {
	float: right;
}



 @keyframes in {
    0% {
       width: 0;
       left: 0;
       right: auto;
   }
    100% {
       left: 0;
       right: auto;
       width: 100%;
   }
}
 @keyframes out {
    0% {
       width: 100%;
       left: auto;
       right: 0;
   }
    100% {
       width: 0;
       left: auto;
       right: 0;
   }
}
 @keyframes show {
    0% {
       opacity: 0;
       transform: translateY(-10px);
   }
    100% {
       opacity: 1;
       transform: translateY(0);
   }
}
 nav a:nth-child(1) {
    animation: show 0.2s 1.1s ease 1 both;
    color: white;
}
 nav a:nth-child(2) {
    animation: show 0.2s 1.2s ease 1 both;
}
 nav a:nth-child(3) {
    animation: show 0.2s 1.3s ease 1 both;
}
 nav a:nth-child(4) {
    animation: show 0.2s 1.4s ease 1 both;
}
 nav a:nth-child(5) {
    animation: show 0.2s 1.5s ease 1 both;
}

 nav a:nth-child(6) {
    animation: show 0.2s 1.5s ease 1 both;
}
 
</style>
<title>Lazy Hotels</title>
</head>
<nav>
  <a href="index.jsp" class="active">Homes</a>
  <a href="roomServlet">Rooms</a>
  <a href="shops.jsp">Shops</a>
  <a href="contactus.jsp">Contacts</a>
  <a href="locateus.jsp">Locate Us</a>
  <a href="verificationpage.jsp">login/sign up</a>
</nav>
<body>



<svg class="hotel" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" id="Layer_1" x="0px" y="0px" viewBox="0 0 512 512" style="enable-background:new 0 0 512 512;" xml:space="preserve" width="512px" height="512px">

<!-- Box Outline & colors   -->
<g>
	<g>
		<path d="M503.603,290.45c-4.639,0-8.397,3.76-8.397,8.397v74.536c0,10.285-8.368,18.652-18.652,18.652H109.332    c-4.639,0-8.397,3.76-8.397,8.397s3.759,8.397,8.397,8.397h367.221c19.545,0,35.446-15.901,35.446-35.446v-74.536    C512,294.21,508.241,290.45,503.603,290.45z" fill="#7B8CDE"/>
	</g>
</g>
<g>
	<g>
		<path d="M476.554,103.171H35.446C15.901,103.171,0,119.073,0,138.618v234.765c0,19.545,15.901,35.446,35.446,35.446h45.895    c4.639,0,8.397-3.76,8.397-8.397c0-4.638-3.759-8.397-8.397-8.397H35.446c-10.285,0-18.652-8.367-18.652-18.652V138.618    c0-10.285,8.368-18.652,18.652-18.652h441.107c10.285,0,18.652,8.367,18.652,18.652v132.238c0,4.637,3.759,8.397,8.397,8.397    s8.397-3.76,8.397-8.397V138.618C512,119.073,496.099,103.171,476.554,103.171z" fill="#7B8CDE"/>
	</g>
</g>

<!-- O Word & Colors -->
<g>
	<g>
		<path d="M191.286,177.168c-19.733,0-35.788,16.054-35.788,35.789v86.087c0,19.733,16.055,35.789,35.789,35.789    c19.733,0,35.788-16.055,35.788-35.789v-86.087C227.075,193.224,211.02,177.168,191.286,177.168z M210.282,299.044    c0,10.473-8.52,18.995-18.994,18.995c-10.473,0-18.993-8.521-18.993-18.995v-86.087c0-10.473,8.52-18.994,18.995-18.994    c10.473,0,18.993,8.52,18.993,18.994V299.044z" fill="#DDFDFE"/>
	</g>
</g>

<!-- H Word & Colors -->
<g>
	<g>
		<path d="M73.5,299.408c-4.639,0-8.397,3.76-8.397,8.397v18.631c0,4.638,3.759,8.397,8.397,8.397s8.397-3.76,8.397-8.397v-18.631    C81.897,303.167,78.139,299.408,73.5,299.408z" fill="#DDFDFE"/>
	</g>
</g>
<g>
	<g>
		<path d="M128.282,177.168c-4.639,0-8.397,3.76-8.397,8.397v62.82H81.897v-62.82c0-4.638-3.759-8.397-8.397-8.397    s-8.397,3.76-8.397,8.397v99.846c0,4.638,3.759,8.397,8.397,8.397s8.397-3.76,8.397-8.397V265.18h37.988v61.255    c0,4.638,3.759,8.397,8.397,8.397s8.397-3.76,8.397-8.397V185.565C136.68,180.928,132.921,177.168,128.282,177.168z" fill="#DDFDFE"/>
	</g>
</g>

<!-- T Word & Colors -->
<g>
	<g>
		<path d="M267.588,232.229c-4.639,0-8.397,3.76-8.397,8.397v85.809c0,4.638,3.759,8.397,8.397,8.397s8.397-3.76,8.397-8.397    v-85.809C275.985,235.989,272.226,232.229,267.588,232.229z" fill="#DDFDFE"/>
	</g>
</g>
<g>
	<g>
		<path d="M294.978,177.168h-54.782c-4.639,0-8.397,3.76-8.397,8.397c0,4.637,3.759,8.397,8.397,8.397h18.994v24.271    c0,4.638,3.759,8.397,8.397,8.397s8.397-3.76,8.397-8.397v-24.271h18.993c4.639,0,8.397-3.76,8.397-8.397    C303.375,180.928,299.617,177.168,294.978,177.168z" fill="#DDFDFE"/>
	</g>
</g>

<!-- L Word & Colors -->
<g>
	<g>
		<path d="M460.892,318.037h-46.386V185.565c0-4.638-3.76-8.397-8.397-8.397c-4.639,0-8.397,3.76-8.397,8.397v140.869    c0,4.638,3.759,8.397,8.397,8.397h54.783c4.639,0,8.397-3.76,8.397-8.397S465.531,318.037,460.892,318.037z" fill="#DDFDFE"/>
	</g>
</g>

<!-- E Word & Colors  -->
<g>
	<g>
		<path d="M377.936,318.037H331.55v-53.64h34.646c4.639,0,8.397-3.76,8.397-8.397s-3.759-8.397-8.397-8.397H331.55v-53.64h46.386    c4.639,0,8.397-3.76,8.397-8.397c0-4.638-3.759-8.397-8.397-8.397h-54.783c-4.639,0-8.397,3.76-8.397,8.397v140.869    c0,4.638,3.759,8.397,8.397,8.397h54.783c4.639,0,8.397-3.76,8.397-8.397S382.574,318.037,377.936,318.037z" fill="#DDFDFE"/>
	</g>
</g>

<!-- Dots -->
<g>
	<g>
		<path d="M480.528,135.853c-3.087-1.968-7.183-1.692-9.978,0.681c-2.56,2.174-3.574,5.837-2.514,9.02    c1.132,3.4,4.38,5.76,7.973,5.76c3.807,0,7.199-2.67,8.136-6.351C485.026,141.51,483.528,137.765,480.528,135.853z" fill="#6461A0"/>
	</g>
</g>
<g>
	<g>
		<path d="M480.528,362.016c-3.08-1.975-7.191-1.684-9.978,0.683c-2.561,2.175-3.574,5.834-2.514,9.02    c1.132,3.4,4.38,5.76,7.973,5.76c3.807,0,7.199-2.67,8.136-6.351C485.027,367.669,483.523,363.937,480.528,362.016z" fill="#6461A0"/>
	</g>
</g>
<g>
	<g>
		<path d="M30.793,136.326c-2.674,2.09-3.836,5.79-2.834,9.033c1.079,3.499,4.369,5.955,8.038,5.955    c3.942,0,7.459-2.881,8.229-6.751C45.723,137.035,36.79,131.637,30.793,136.326z" fill="#6461A0"/>
	</g>
</g>
<g>
	<g>
		<path d="M40.376,361.929c-3.169-1.937-7.355-1.533-10.086,0.989c-5.493,5.072-1.761,14.561,5.707,14.561    c3.86,0,7.29-2.749,8.164-6.499C44.973,367.499,43.421,363.791,40.376,361.929z" fill="#6461A0"/>
	</g>
</g>
</svg>

<div class="flex">
  <div class="box-group box-group-1">
    <div class="box box-top"></div>
    <div class="box box-bottom"></div>
  </div>
  <div class="box-group box-group-2">
    <div class="box box-top"></div>
    <div class="box box-bottom"></div>
  </div>
  <div class="box-group box-group-3">
    <div class="box box-top"></div>
    <div class="box box-bottom"></div>
  </div>
  <div class="box-group box-group-4">
    <div class="box box-top"></div>
    <div class="box box-bottom"></div>
  </div>
  <div class="box-group box-group-5">
    <div class="box box-top"></div>
    <div class="box box-bottom"></div>
  </div>
  <div class="box-group box-group-6">
    <div class="box box-top"></div>
    <div class="box box-bottom"></div>
  </div>
</div>
</body>
</html>
