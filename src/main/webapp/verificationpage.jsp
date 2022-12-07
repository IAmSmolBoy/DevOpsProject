<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
/* This part is the body  */
	.flex {
    display: flex;
    flex-wrap: no-wrap;
    overflow: hidden;
    background: #111;
}

 html, body, .flex {
    height: 100%;
    width: 100%;
    margin: 0;
    background: #191D32;
}

body {
	height: 75vh;
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
    position: absolute;
    top: 30px;
    text-align: center;
    background-color: #191D32;
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

.container{
    position: relative;
    max-width: 430px;
    width: 100%;
    background: #fff;
    border-radius: 10px;
    box-shadow: 0 5px 10px rgba(0, 0, 0, 0.1);
    overflow: hidden;
    margin: 0 20px;
}
.container{
    position: relative;
    max-width: 430px;
    width: 100%;
    background: #fff;
    border-radius: 10px;
    box-shadow: 0 5px 10px rgba(0, 0, 0, 0.1);
    overflow: hidden;
    margin: 0 20px;
}

.container .forms{
    display: flex;
    align-items: center;
    height: 440px;
    width: 200%;
    transition: height 0.2s ease;
}


.container .form{
    width: 50%;
    padding: 30px;
    background-color: #fff;
    transition: margin-left 0.18s ease;
}

.container.active .login{
    margin-left: -50%;
    opacity: 0;
    transition: margin-left 0.18s ease, opacity 0.15s ease;
}

.container .signup{
    opacity: 0;
    transition: opacity 0.09s ease;
}
.container.active .signup{
    opacity: 1;
    transition: opacity 0.2s ease;
}

.container.active .forms{
    height: 600px;
}
.container .form .title{
    position: relative;
    font-size: 27px;
    font-weight: 600;
}
.form .title::before{
    content: '';
    position: absolute;
    left: 0;
    bottom: 0;
    height: 3px;
    width: 30px;
    background-color: #4070f4;
    border-radius: 25px;
}

.form .input-field{
    position: relative;
    height: 50px;
    width: 100%;
    margin-top: 30px;
}

.input-field input{
    position: absolute;
    height: 100%;
    width: 100%;
    padding: 0 35px;
    border: none;
    outline: none;
    font-size: 16px;
    border-bottom: 2px solid #ccc;
    border-top: 2px solid transparent;
    transition: all 0.2s ease;
}

.input-field input:is(:focus, :valid){
    border-bottom-color: #4070f4;
}

.input-field i{
    position: absolute;
    top: 50%;
    transform: translateY(-50%);
    color: #999;
    font-size: 23px;
    transition: all 0.2s ease;
}

.input-field input:is(:focus, :valid) ~ i{
    color: #4070f4;
}

.input-field i.icon{
    left: 0;
}
.input-field i.showHidePw{
    right: 0;
    cursor: pointer;
    padding: 10px;
}

.form .checkbox-text{
    display: flex;
    align-items: center;
    justify-content: space-between;
    margin-top: 20px;
}

.checkbox-text .checkbox-content{
    display: flex;
    align-items: center;
}

.checkbox-content input{
    margin-right: 10px;
    accent-color: #4070f4;
}

.form .text{
    color: #333;
    font-size: 14px;
}

.form a.text{
    color: #4070f4;
    text-decoration: none;
}
.form a:hover{
    text-decoration: underline;
}

.form .button{
    margin-top: 35px;
}

.form .button input{
    border: none;
    color: #fff;
    font-size: 17px;
    font-weight: 500;
    letter-spacing: 1px;
    border-radius: 6px;
    background-color: #4070f4;
    cursor: pointer;
    transition: all 0.3s ease;
}

.button input:hover{
    background-color: #265df2;
}

.form .login-signup{
    margin-top: 30px;
    text-align: center;
}

*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Poppins', sans-serif;
}

body{
    height: 100vh;
    display: flex;
    align-items: center;
    justify-content: center;
}

</style>

<title>Lazy Hotels</title>
</head>
<body>
<nav>
  <a href="index.jsp">Home</a>
  <a href="roomServlet">Rooms</a>
  <a href="shops.jsp">Shops</a>
  <a href="contactus.jsp">Contacts</a>
  <a href="locateus.jsp">Locate Us</a>
  <a href="verificationpage.jsp">login/sign up</a>
</nav>

<div class="container">
        <div class="forms">
            <div class="form login">
                <span class="title">Login</span>

                <form action="#">
                    <div class="input-field">
                        <input type="text" placeholder="Enter your email" required>
                        <i class="uil uil-envelope icon"></i>
                    </div>
                    <div class="input-field">
                        <input type="password" class="password" placeholder="Enter your password" required>
                        <i class="uil uil-lock icon"></i>
                        <i class="uil uil-eye-slash showHidePw"></i>
                    </div>

                    <div class="checkbox-text">
                        <div class="checkbox-content">
                            <input type="checkbox" id="logCheck">
                            <label for="logCheck" class="text">Remember me</label>
                        </div>
                        
                        <a href="#" class="text">Forgot password?</a>
                    </div>

                    <div class="input-field button">
                        <input type="button" value="Login">
                    </div>
                </form>

                <div class="login-signup">
                    <span class="text">Not a member?
                        <a href="#" class="text signup-link">Signup Now</a>
                    </span>
                </div>
            </div>
            
             <!-- Registration Form -->
            <div class="form signup">
                <span class="title">Registration</span>

                <form action="#">
                    <div class="input-field">
                        <input type="text" placeholder="Enter your name" required>
                        <i class="uil uil-user"></i>
                    </div>
                    <div class="input-field">
                        <input type="text" placeholder="Enter your email" required>
                        <i class="uil uil-envelope icon"></i>
                    </div>
                    <div class="input-field">
                        <input type="password" class="password" placeholder="Create a password" required>
                        <i class="uil uil-lock icon"></i>
                    </div>
                    <div class="input-field">
                        <input type="password" class="password" placeholder="Confirm a password" required>
                        <i class="uil uil-lock icon"></i>
                        <i class="uil uil-eye-slash showHidePw"></i>
                    </div>

                    <div class="checkbox-text">
                        <div class="checkbox-content">
                            <input type="checkbox" id="termCon">
                            <label for="termCon" class="text">I accepted all terms and conditions</label>
                        </div>
                    </div>

                    <div class="input-field button">
                        <input type="button" value="Signup">
                    </div>
                </form>

                <div class="login-signup">
                    <span class="text">Already a member?
                        <a href="#" class="text login-link">Login Now</a>
                    </span>
                </div>
            </div>
        </div>
    </div>

<script>
const container = document.querySelector(".container"),
      pwShowHide = document.querySelectorAll(".showHidePw"),
      pwFields = document.querySelectorAll(".password"),
      signUp = document.querySelector(".signup-link"),
      login = document.querySelector(".login-link");

    //   js code to show/hide password and change icon
    pwShowHide.forEach(eyeIcon =>{
        eyeIcon.addEventListener("click", ()=>{
            pwFields.forEach(pwField =>{
                if(pwField.type ==="password"){
                    pwField.type = "text";

                    pwShowHide.forEach(icon =>{
                        icon.classList.replace("uil-eye-slash", "uil-eye");
                    })
                }else{
                    pwField.type = "password";

                    pwShowHide.forEach(icon =>{
                        icon.classList.replace("uil-eye", "uil-eye-slash");
                    })
                }
            }) 
        })
    })

    // js code to appear signup and login form
    signUp.addEventListener("click", ( )=>{
        container.classList.add("active");
    });
    login.addEventListener("click", ( )=>{
        container.classList.remove("active");
    });

</script>
 Changes
</body>
</html>