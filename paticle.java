
				function FBcom(a,b) {
					setTimeout(function() {
						var m = 0, n = true, op = 0;
						$(a+", "+a+" .comtxt, "+a+" .combot").slideDown(500);
						$().slideDown(500);
						var t = setInterval(function() {
							op += 0.2;
							$(a).css({"opacity":op});
							m++;
							if(m == 5) clearInterval(t);
						}, 100);
					}, b);
				}
				function random(min, max) {
					return Math.round(Math.random() * (max - min) + min);
				}
				function checkZero(a) {
					if(a<10) {
						return "0"+a;
					} else {
						return a;
					}
				}
				function timer(a,b) {
					var min = checkZero(Math.round((a-30)/60));
					var sec = checkZero(a%60);
					$(b).html(min+":"+sec);
					var t = setInterval(function() {
						a--;
						min = checkZero(Math.round((a-30)/60));
						sec = checkZero(a%60);
						$(b).html(min+":"+sec);
						if(a == 0) {
							clearInterval(t);
						}
					}, 1000);
					return false;
				}
				$(document).ready(function() {
					timer(231, "#timer");
					$(".like").click(function() {
						if($(this).hasClass("selected")) {
							$(this).removeClass("selected");
							$(this).html("Like");
							$("#youand").html("");
						} else {
							$(this).addClass("selected");
							$(this).html("Unlike");
							$("#youand").html("You and ");
						}
					});
					$(".fblike").click(function() {
						if($(this).hasClass("selected")) {
							$(this).removeClass("selected");
							$(this).html("Like");
						} else {
							$(this).addClass("selected");
							$(this).html("Unlike");
						}
					});
					FBcom("#fb1",3000);
					FBcom("#fb2",8000);
					FBcom("#fb3",15000);
					FBcom("#fb4",19000);
					FBcom("#fb5",30500);
					FBcom("#fb6",53000);
					FBcom("#fb7",75000);
					FBcom("#fb8",90000);
					var ct = 48;
					(function loop() {
						var rand = random(2500,5500);
						var ctrand = random(1,4);
						ct = ct - ctrand;
						if(ct > 1) {
							setTimeout(function() {
								loop();
							}, rand);
						} else {
							ct = "few";
						}
						$("#count").html(ct);
					}());
				});
		