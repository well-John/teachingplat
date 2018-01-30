<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head id="Head1">
<link rel="icon" href="favicon.ico" />
<link href="css/Default.css" rel="stylesheet" type="text/css" />
<link href="css/zzsc.css" rel="stylesheet" type="text/css" />
<script src="js/jquery-1.10.1.min.js" type="text/javascript"></script>
</head>
<body>
	<!-- <form method="post" action="" id="form1"> -->
	<div class="aspNetHidden">
		<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE"
			value="/wEPBRI2MzYwNzc0NTI5NTk2OTE0NjlkCT57ZwYpn4uryA0OXtIBhHK46f4=" />
	</div>

	<div class="aspNetHidden">

		<input type="hidden" name="__VIEWSTATEGENERATOR"
			id="__VIEWSTATEGENERATOR" value="CA0B0334" /> <input type="hidden"
			name="__EVENTVALIDATION" id="__EVENTVALIDATION"
			value="/wEdAAdyPk3eoEfKlDbyklbDXTx8Wd0Cl/PstotrlswLYuLs80gFaq7KyD0yKCoEvcvk0S5SxkUNG8qcX/xZR7ChOf/Odjb4xzpKucCqKjegIpvFhrsFg7eGV9D0vuLs/X8R4HqinihG6d/Xh3PZm3b5AoMQkKQTu4w0bp5zQ+Iy2+sXNSH0uGo=" />
	</div>


	<!-- 代码 开始 -->
	<div id="leftsead">
		<ul>

			<li><a href="javascript:void(0)" class="youhui"> <img
					src="rightimg/l02.png" width="47" height="49" class="shows" /> <img
					src="rightimg/a.png" width="57" height="49" class="hides" /> <img
					src="images/wx.jpg" class="2wm"
					style="display: none; margin: -100px 57px 0 0" />
			</a></li>

			<li id="tel"><a href="javascript:void(0)">
					<div class="hides" style="width: 161px; display: none;" id="tels">
						<div class="hides" id="p1">
							<img src="rightimg/ll05.png">

						</div>
						<div class="hides" id="p3">
							<span style="color: #FFF; font-size: 12px">021-51082788</span>
						</div>
					</div> <img src="rightimg/l05.png" width="47" height="49" class="shows" />
			</a></li>

			<li id="btn"><a id="top_btn">
					<div class="hides" style="width: 161px; display: none">
						<img src="rightimg/ll06.png" width="161" height="49" />
					</div> <img src="rightimg/l06.png" width="47" height="49" class="shows" />
			</a></li>
		</ul>
	</div>

	<script>

        $(document).ready(function () {

            $("#leftsead a").hover(function () {
                if ($(this).prop("className") == "youhui") {
                    $(this).children("img.hides").show();
                } else {
                    $(this).children("div.hides").show();
                    $(this).children("img.shows").hide();
                    $(this).children("div.hides").animate({ marginRight: '0px' }, '0');
                }
            }, function () {
                if ($(this).prop("className") == "youhui") {
                    $(this).children("img.hides").hide();
                } else {
                    $(this).children("div.hides").animate({ marginRight: '-163px' }, 0, function () { $(this).hide(); $(this).next("img.shows").show(); });
                }
            });

            $("#top_btn").click(function () { if (scroll == "off") return; $("html,body").animate({ scrollTop: 0 }, 600); });

            //右侧导航 - 二维码
            $(".youhui").mouseover(function () {
                $(this).children(".2wm").show();
            })
            $(".youhui").mouseout(function () {
                $(this).children(".2wm").hide();
            });


        });


    </script>
	<!-- 代码 结束 -->
	<div class="topbar">
		<div class="topbox">
			<div id="Header1_divLogin" class="box_1">
				您好！欢迎来到阳光家教网！<a href="#">请登录</a> | <a href="register.jsp">免费注册</a>
			</div>

			<div class="box_2">
				<div class="wxwb">
					<div class="wb">
						<a href="#" target="_blank" rel="nofollow"><span>&nbsp;</span>阳光家教微博</a>
					</div>
					<div class="wx">
						<a href="javascript:void(0);"><span>&nbsp;</span>阳光家教微信</a>
						<div class="wximg">
							<img src="images/wx.jpg" />
						</div>
						<script type="text/javascript">
                            $("div.wx").hover(function () {
                                $(this).children(".wximg").show();
                            }, function () {
                                $(this).children(".wximg").hide();
                            });
                        </script>
					</div>
				</div>
				<div class="fav">
					<div class="tel">
						全国投诉专线：<span>021-51082788*2</span>
					</div>
					<span>&nbsp;|&nbsp;<a
						href="javascript:window.external.addFavorite('index.html','阳光家教网')">收藏本站</a></span>
				</div>
			</div>
		</div>
	</div>
	<!--end top-->
	<!--head-->
	<div class="head">
		<div class="logo">
			<h1>
				<a href="index.jsp"><img src="images/logo.png" border="0" /></a>
			</h1>
		</div>
		<div class="city">
			<h3>上海</h3>
			<span><a href="index.jsp">[切换城市]</a></span>
		</div>
		<div class="cityTel">
			<span>上海热线电话</span>
			<p>021-51082788</p>
		</div>
		<div class="info2" style='display: none'>
			<p class="txt">
				阳光家教已有<span id="Header1_teacherCount" class="num">542643</span>名注册教员<br />帮助了<span
					id="Header1_studentCount" class="num">170587</span>名家长找家教
			</p>
		</div>
	</div>
	<!--end head-->
	<!--nav-->
	<div class="navBar">
		<div class="navBox">
			<div class="classBox">
				<div class='class'>
					<a href='Teacherlist.jsp'><font color="#ffffff">上海家教</font></a>
				</div>

			</div>
			<div class="nav">
				<ul>
					<li><a href="jy_a0_s02_c0_f0_x0_g1/" class=''>数学家教</a></li>
					<li><a href="jy_a0_s03_c0_f0_x0_g1/" class=''>英语家教</a></li>
					<li><a href="Cost.jsp" class=''>家教价格</a></li>
					<li><a href="Teachers.jsp" class=''>家教老师库</a></li>
					<li><a href="Orders.jsp" class=''>学员库</a></li>
					<li><a href="Articles.jsp" class='' target="_blank">家教学堂</a></li>
					<li><a href='/Login' class=''>个人中心</a></li>
				</ul>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="js/Xslider.js"></script>
	<script type="text/javascript">

        //科目
        $(".classBox").hover(function () {
            $(".classBox>.class").removeClass("classOn");
            $(".classBox>.subNav").show();
        }, function () {
            $(".classBox>.subNav").hide();
            $(".classBox>.class").addClass("classOn");
        });

        $(".classBox2>.libox").hover(function () {
            $(this).children("div.div1").addClass("on");
            $(this).children("div.div2").show();
        }, function () {
            $(this).children("div.div1").removeClass("on");
            $(this).children("div.div2").hide();
        });
    </script>
	<!--end nav-->

	<!--idx container-->
	<div class="container">
		<!--idx left-->
		<div class="idxleft">
			<!--class-->
			<div class="classBox">
				<div class="classBox2">

					<div class="libox">
						<div class='r2 div1'>
							<h3>
								<a href='/jy_a0_s5001_c0_f0_x0_g1/'> 学龄前家教</a>
							</h3>
							</p>
						</div>
						<div class="div2">
							<ul>
								<li>
									<div class="sclass">

										<a href='/jy_a0_s1_c0_f0_x0_g1/'> 启蒙教育家教</a> | <a
											href='/jy_a0_s271_c0_f0_x0_g1/'> 幼小衔接家教</a> | <a
											href='/jy_a0_s2_c0_f0_x0_g1/'> 学前教育家教</a> | <a
											href='/jy_a0_s3_c0_f0_x0_g1/'> 幼儿陪玩家教</a> | <a
											href='/jy_a0_s4_c0_f0_x0_g1/'> 幼儿托管家教</a> | <a
											href='/jy_a0_s5_c0_f0_x0_g1/'> 珠心算家教</a> |

									</div>
									<div class="clear">&nbsp;</div>
								</li>
							</ul>
							<div class="clear">&nbsp;</div>
						</div>
					</div>

					<div class="libox">
						<div class='div1'>
							<h3>
								<a href='/jy_a0_s5002_c0_f0_x0_g1/'> 小学课程家教</a>
							</h3>
							</p>
						</div>
						<div class="div2">
							<ul>
								<li>
									<div class="sclass">

										<a href='/jy_a0_s6_c0_f0_x0_g1/'> 小学语文家教</a> | <a
											href='/jy_a0_s7_c0_f0_x0_g1/'> 小学数学家教</a> | <a
											href='/jy_a0_s8_c0_f0_x0_g1/'> 小学英语家教</a> | <a
											href='/jy_a0_s9_c0_f0_x0_g1/'> 星级英语家教</a> | <a
											href='/jy_a0_s10_c0_f0_x0_g1/'> 小学奥数家教</a> | <a
											href='/jy_a0_s256_c0_f0_x0_g1/'> 小学科学家教</a> | <a
											href='/jy_a0_s11_c0_f0_x0_g1/'> 小学陪读家教</a> | <a
											href='/jy_a0_s12_c0_f0_x0_g1/'> 小学托管家教</a> | <a
											href='/jy_a0_s13_c0_f0_x0_g1/'> 小学接送家教</a> | <a
											href='/jy_a0_s14_c0_f0_x0_g1/'> 小学英文版教材家教</a> |

									</div>
									<div class="clear">&nbsp;</div>
								</li>
							</ul>
							<div class="clear">&nbsp;</div>
						</div>
					</div>

					<div class="libox">
						<div class='r2 div1'>
							<h3>
								<a href='/jy_a0_s5003_c0_f0_x0_g1/'> 初中课程家教</a>
							</h3>
							</p>
						</div>
						<div class="div2">
							<ul>
								<li>
									<div class="sclass">

										<a href='/jy_a0_s15_c0_f0_x0_g1/'> 初一初二语文家教</a> | <a
											href='/jy_a0_s16_c0_f0_x0_g1/'> 初一初二英语家教</a> | <a
											href='/jy_a0_s17_c0_f0_x0_g1/'> 初一初二数学家教</a> | <a
											href='/jy_a0_s18_c0_f0_x0_g1/'> 初一初二物理家教</a> | <a
											href='/jy_a0_s19_c0_f0_x0_g1/'> 初一初二化学家教</a> | <a
											href='/jy_a0_s20_c0_f0_x0_g1/'> 初一初二奥数家教</a> | <a
											href='/jy_a0_s257_c0_f0_x0_g1/'> 初一初二科学家教</a> | <a
											href='/jy_a0_s21_c0_f0_x0_g1/'> 初三语文家教</a> | <a
											href='/jy_a0_s22_c0_f0_x0_g1/'> 初三英语家教</a> | <a
											href='/jy_a0_s23_c0_f0_x0_g1/'> 初三数学家教</a> | <a
											href='/jy_a0_s24_c0_f0_x0_g1/'> 初三物理家教</a> | <a
											href='/jy_a0_s25_c0_f0_x0_g1/'> 初三化学家教</a> | <a
											href='/jy_a0_s26_c0_f0_x0_g1/'> 初三生物家教</a> | <a
											href='/jy_a0_s27_c0_f0_x0_g1/'> 初三历史家教</a> | <a
											href='/jy_a0_s28_c0_f0_x0_g1/'> 初三地理家教</a> | <a
											href='/jy_a0_s29_c0_f0_x0_g1/'> 初三政治家教</a> | <a
											href='/jy_a0_s30_c0_f0_x0_g1/'> 初三奥数家教</a> | <a
											href='/jy_a0_s258_c0_f0_x0_g1/'> 初三科学家教</a> | <a
											href='/jy_a0_s31_c0_f0_x0_g1/'> SSAT家教</a> | <a
											href='/jy_a0_s229_c0_f0_x0_g1/'> GCSE家教</a> | <a
											href='/jy_a0_s267_c0_f0_x0_g1/'> IGCSE家教</a> | <a
											href='/jy_a0_s32_c0_f0_x0_g1/'> 初中文科英文版家教</a> | <a
											href='/jy_a0_s33_c0_f0_x0_g1/'> 初中理科英文版家教</a> | <a
											href='/jy_a0_s34_c0_f0_x0_g1/'> 中考心理辅导家教</a> |

									</div>
									<div class="clear">&nbsp;</div>
								</li>
							</ul>
							<div class="clear">&nbsp;</div>
						</div>
					</div>

					<div class="libox">
						<div class='div1'>
							<h3>
								<a href='/jy_a0_s5004_c0_f0_x0_g1/'> 高中课程家教</a>
							</h3>
							</p>
						</div>
						<div class="div2">
							<ul>
								<li>
									<div class="sclass">

										<a href='/jy_a0_s35_c0_f0_x0_g1/'> 高一高二语文家教</a> | <a
											href='/jy_a0_s36_c0_f0_x0_g1/'> 高一高二英语家教</a> | <a
											href='/jy_a0_s37_c0_f0_x0_g1/'> 高一高二数学家教</a> | <a
											href='/jy_a0_s38_c0_f0_x0_g1/'> 高一高二物理家教</a> | <a
											href='/jy_a0_s39_c0_f0_x0_g1/'> 高一高二化学家教</a> | <a
											href='/jy_a0_s40_c0_f0_x0_g1/'> 高一高二生物家教</a> | <a
											href='/jy_a0_s41_c0_f0_x0_g1/'> 高一高二历史家教</a> | <a
											href='/jy_a0_s42_c0_f0_x0_g1/'> 高一高二地理家教</a> | <a
											href='/jy_a0_s43_c0_f0_x0_g1/'> 高一高二政治家教</a> | <a
											href='/jy_a0_s44_c0_f0_x0_g1/'> 高一高二奥数家教</a> | <a
											href='/jy_a0_s259_c0_f0_x0_g1/'> 高一高二科学家教</a> | <a
											href='/jy_a0_s45_c0_f0_x0_g1/'> 高三语文家教</a> | <a
											href='/jy_a0_s46_c0_f0_x0_g1/'> 高三英语家教</a> | <a
											href='/jy_a0_s47_c0_f0_x0_g1/'> 高三数学家教</a> | <a
											href='/jy_a0_s48_c0_f0_x0_g1/'> 高三物理家教</a> | <a
											href='/jy_a0_s49_c0_f0_x0_g1/'> 高三化学家教</a> | <a
											href='/jy_a0_s50_c0_f0_x0_g1/'> 高三生物家教</a> | <a
											href='/jy_a0_s51_c0_f0_x0_g1/'> 高三历史家教</a> | <a
											href='/jy_a0_s52_c0_f0_x0_g1/'> 高三地理家教</a> | <a
											href='/jy_a0_s53_c0_f0_x0_g1/'> 高三政治家教</a> | <a
											href='/jy_a0_s54_c0_f0_x0_g1/'> 高三奥数 家教</a> | <a
											href='/jy_a0_s260_c0_f0_x0_g1/'> 高三科学家教</a> | <a
											href='/jy_a0_s55_c0_f0_x0_g1/'> AP家教</a> | <a
											href='/jy_a0_s56_c0_f0_x0_g1/'> SAT家教</a> | <a
											href='/jy_a0_s230_c0_f0_x0_g1/'> A-Level家教</a> | <a
											href='/jy_a0_s57_c0_f0_x0_g1/'> 高中文科英文版家教</a> | <a
											href='/jy_a0_s58_c0_f0_x0_g1/'> 高中理科英文版家教</a> | <a
											href='/jy_a0_s59_c0_f0_x0_g1/'> 高考心理辅导家教</a> |

									</div>
									<div class="clear">&nbsp;</div>
								</li>
							</ul>
							<div class="clear">&nbsp;</div>
						</div>
					</div>

					<div class="libox">
						<div class='r2 div1'>
							<h3>
								<a href='/jy_a0_s5005_c0_f0_x0_g1/'> 三校生课程家教</a>
							</h3>
							</p>
						</div>
						<div class="div2">
							<ul>
								<li>
									<div class="sclass">

										<a href='/jy_a0_s60_c0_f0_x0_g1/'> 三校生语文家教</a> | <a
											href='/jy_a0_s61_c0_f0_x0_g1/'> 三校生数学家教</a> | <a
											href='/jy_a0_s62_c0_f0_x0_g1/'> 三校生英语家教</a> | <a
											href='/jy_a0_s63_c0_f0_x0_g1/'> 三校生物理家教</a> | <a
											href='/jy_a0_s64_c0_f0_x0_g1/'> 三校生化学家教</a> | <a
											href='/jy_a0_s65_c0_f0_x0_g1/'> 三校生生物家教</a> | <a
											href='/jy_a0_s66_c0_f0_x0_g1/'> 三校生历史家教</a> | <a
											href='/jy_a0_s67_c0_f0_x0_g1/'> 三校生地理家教</a> | <a
											href='/jy_a0_s68_c0_f0_x0_g1/'> 三校生政治家教</a> |

									</div>
									<div class="clear">&nbsp;</div>
								</li>
							</ul>
							<div class="clear">&nbsp;</div>
						</div>
					</div>

					<div class="libox">
						<div class='div1'>
							<h3>
								<a href='/jy_a0_s5006_c0_f0_x0_g1/'> 大学课程家教</a>
							</h3>
							</p>
						</div>
						<div class="div2">
							<ul>
								<li>
									<div class="sclass">

										<a href='/jy_a0_s69_c0_f0_x0_g1/'> 高等数学家教</a> | <a
											href='/jy_a0_s70_c0_f0_x0_g1/'> 英语四级家教</a> | <a
											href='/jy_a0_s71_c0_f0_x0_g1/'> 英语六级家教</a> | <a
											href='/jy_a0_s72_c0_f0_x0_g1/'> 英语八级家教</a> | <a
											href='/jy_a0_s73_c0_f0_x0_g1/'> 论文指导家教</a> | <a
											href='/jy_a0_s74_c0_f0_x0_g1/'> 会计家教</a> | <a
											href='/jy_a0_s308_c0_f0_x0_g1/'> 成人高考家教</a> | <a
											href='/jy_a0_s309_c0_f0_x0_g1/'> 专升本家教</a> | <a
											href='/jy_a0_s310_c0_f0_x0_g1/'> 考研家教</a> |

									</div>
									<div class="clear">&nbsp;</div>
								</li>
							</ul>
							<div class="clear">&nbsp;</div>
						</div>
					</div>

					<div class="libox">
						<div class='r2 div1'>
							<h3>
								<a href='/jy_a0_s5007_c0_f0_x0_g1/'> 中文/方言家教</a>
							</h3>
							</p>
						</div>
						<div class="div2">
							<ul>
								<li>
									<div class="sclass">

										<a href='/jy_a0_s75_c0_f0_x0_g1/'> 外国人中文家教</a> | <a
											href='/jy_a0_s76_c0_f0_x0_g1/'> 精准普通话家教</a> | <a
											href='/jy_a0_s77_c0_f0_x0_g1/'> 手语家教</a> | <a
											href='/jy_a0_s78_c0_f0_x0_g1/'> 上海话家教</a> | <a
											href='/jy_a0_s79_c0_f0_x0_g1/'> 粤语家教</a> | <a
											href='/jy_a0_s80_c0_f0_x0_g1/'> 闽南语家教</a> |

									</div>
									<div class="clear">&nbsp;</div>
								</li>
							</ul>
							<div class="clear">&nbsp;</div>
						</div>
					</div>

					<div class="libox">
						<div class='div1'>
							<h3>
								<a href='/jy_a0_s5008_c0_f0_x0_g1/'> 外语/翻译家教</a>
							</h3>
							</p>
						</div>
						<div class="div2">
							<ul>
								<li>
									<div class="sclass">

										<a href='/jy_a0_s81_c0_f0_x0_g1/'> 英语口语家教</a> | <a
											href='/jy_a0_s82_c0_f0_x0_g1/'> 商务英语家教</a> | <a
											href='/jy_a0_s83_c0_f0_x0_g1/'> 新概念英语家教</a> | <a
											href='/jy_a0_s84_c0_f0_x0_g1/'> 牛津英语家教</a> | <a
											href='/jy_a0_s85_c0_f0_x0_g1/'> 剑桥英语家教</a> | <a
											href='/jy_a0_s86_c0_f0_x0_g1/'> 中级口译家教</a> | <a
											href='/jy_a0_s87_c0_f0_x0_g1/'> 高级口译家教</a> | <a
											href='/jy_a0_s88_c0_f0_x0_g1/'> 托福家教</a> | <a
											href='/jy_a0_s232_c0_f0_x0_g1/'> 托业家教</a> | <a
											href='/jy_a0_s89_c0_f0_x0_g1/'> 雅思家教</a> | <a
											href='/jy_a0_s90_c0_f0_x0_g1/'> 笔译家教</a> | <a
											href='/jy_a0_s91_c0_f0_x0_g1/'> 口译家教</a> | <a
											href='/jy_a0_s92_c0_f0_x0_g1/'> 商务谈判家教</a> | <a
											href='/jy_a0_s93_c0_f0_x0_g1/'> 同声传译家教</a> | <a
											href='/jy_a0_s94_c0_f0_x0_g1/'> GRE家教</a> | <a
											href='/jy_a0_s95_c0_f0_x0_g1/'> GMAT家教</a> | <a
											href='/jy_a0_s96_c0_f0_x0_g1/'> LSAT家教</a> | <a
											href='/jy_a0_s97_c0_f0_x0_g1/'> TOPE家教</a> | <a
											href='/jy_a0_s98_c0_f0_x0_g1/'> BEC家教</a> | <a
											href='/jy_a0_s99_c0_f0_x0_g1/'> MSE家教</a> | <a
											href='/jy_a0_s102_c0_f0_x0_g1/'> 日语家教</a> | <a
											href='/jy_a0_s103_c0_f0_x0_g1/'> 法语家教</a> | <a
											href='/jy_a0_s104_c0_f0_x0_g1/'> 德语家教</a> | <a
											href='/jy_a0_s105_c0_f0_x0_g1/'> 韩语家教</a> | <a
											href='/jy_a0_s106_c0_f0_x0_g1/'> 俄语家教</a> | <a
											href='/jy_a0_s107_c0_f0_x0_g1/'> 希腊语家教</a> | <a
											href='/jy_a0_s108_c0_f0_x0_g1/'> 瑞典语家教</a> | <a
											href='/jy_a0_s109_c0_f0_x0_g1/'> 荷兰语家教</a> | <a
											href='/jy_a0_s110_c0_f0_x0_g1/'> 意大利语家教</a> | <a
											href='/jy_a0_s111_c0_f0_x0_g1/'> 西班牙语家教</a> | <a
											href='/jy_a0_s112_c0_f0_x0_g1/'> 葡萄牙语家教</a> | <a
											href='/jy_a0_s113_c0_f0_x0_g1/'> 阿拉伯语家教</a> | <a
											href='/jy_a0_s231_c0_f0_x0_g1/'> 波兰语家教</a> | <a
											href='/jy_a0_s264_c0_f0_x0_g1/'> 希伯来语家教</a> | <a
											href='/jy_a0_s114_c0_f0_x0_g1/'> 乌克兰语家教</a> | <a
											href='/jy_a0_s115_c0_f0_x0_g1/'> 泰语家教</a> |

									</div>
									<div class="clear">&nbsp;</div>
								</li>
							</ul>
							<div class="clear">&nbsp;</div>
						</div>
					</div>

					<div class="libox">
						<div class='r2 div1'>
							<h3>
								<a href='/jy_a0_s5009_c0_f0_x0_g1/'> 艺术/乐器家教</a>
							</h3>
							</p>
						</div>
						<div class="div2">
							<ul>
								<li>
									<div class="sclass">

										<a href='/jy_a0_s116_c0_f0_x0_g1/'> 钢琴家教</a> | <a
											href='/jy_a0_s117_c0_f0_x0_g1/'> 电子琴家教</a> | <a
											href='/jy_a0_s118_c0_f0_x0_g1/'> 小提琴家教</a> | <a
											href='/jy_a0_s119_c0_f0_x0_g1/'> 中提琴家教</a> | <a
											href='/jy_a0_s120_c0_f0_x0_g1/'> 大提琴家教</a> | <a
											href='/jy_a0_s121_c0_f0_x0_g1/'> 长笛家教</a> | <a
											href='/jy_a0_s122_c0_f0_x0_g1/'> 吉它家教</a> | <a
											href='/jy_a0_s123_c0_f0_x0_g1/'> 手风琴家教</a> | <a
											href='/jy_a0_s124_c0_f0_x0_g1/'> 萨克斯家教</a> | <a
											href='/jy_a0_s125_c0_f0_x0_g1/'> 黑管家教</a> | <a
											href='/jy_a0_s126_c0_f0_x0_g1/'> 单簧管家教</a> | <a
											href='/jy_a0_s127_c0_f0_x0_g1/'> 双簧管家教</a> | <a
											href='/jy_a0_s128_c0_f0_x0_g1/'> 打击乐家教</a> | <a
											href='/jy_a0_s129_c0_f0_x0_g1/'> 小号家教</a> | <a
											href='/jy_a0_s130_c0_f0_x0_g1/'> 大号家教</a> | <a
											href='/jy_a0_s131_c0_f0_x0_g1/'> 圆号家教</a> | <a
											href='/jy_a0_s132_c0_f0_x0_g1/'> 二胡家教</a> | <a
											href='/jy_a0_s133_c0_f0_x0_g1/'> 笛子家教</a> | <a
											href='/jy_a0_s134_c0_f0_x0_g1/'> 琵琶家教</a> | <a
											href='/jy_a0_s135_c0_f0_x0_g1/'> 古筝家教</a> | <a
											href='/jy_a0_s136_c0_f0_x0_g1/'> 唢呐家教</a> | <a
											href='/jy_a0_s137_c0_f0_x0_g1/'> 笙家教</a> | <a
											href='/jy_a0_s138_c0_f0_x0_g1/'> 箫家教</a> | <a
											href='/jy_a0_s262_c0_f0_x0_g1/'> 埙家教</a> | <a
											href='/jy_a0_s139_c0_f0_x0_g1/'> 巴乌家教</a> | <a
											href='/jy_a0_s140_c0_f0_x0_g1/'> 葫芦丝家教</a> | <a
											href='/jy_a0_s141_c0_f0_x0_g1/'> 扬琴家教</a> | <a
											href='/jy_a0_s142_c0_f0_x0_g1/'> 柳琴家教</a> | <a
											href='/jy_a0_s143_c0_f0_x0_g1/'> 中阮家教</a> | <a
											href='/jy_a0_s144_c0_f0_x0_g1/'> 古琴家教</a> | <a
											href='/jy_a0_s145_c0_f0_x0_g1/'> 三弦家教</a> | <a
											href='/jy_a0_s146_c0_f0_x0_g1/'> 板胡家教</a> | <a
											href='/jy_a0_s263_c0_f0_x0_g1/'> 三味线家教</a> | <a
											href='/jy_a0_s265_c0_f0_x0_g1/'> 尤克里里家教</a> | <a
											href='/jy_a0_s147_c0_f0_x0_g1/'> 摄影家教</a> | <a
											href='/jy_a0_s148_c0_f0_x0_g1/'> 书法家教</a> | <a
											href='/jy_a0_s149_c0_f0_x0_g1/'> 美术家教</a> | <a
											href='/jy_a0_s150_c0_f0_x0_g1/'> 雕塑家教</a> | <a
											href='/jy_a0_s151_c0_f0_x0_g1/'> 剪纸家教</a> | <a
											href='/jy_a0_s152_c0_f0_x0_g1/'> 陶艺家教</a> | <a
											href='/jy_a0_s153_c0_f0_x0_g1/'> 儿童画家教</a> | <a
											href='/jy_a0_s154_c0_f0_x0_g1/'> 卡通画家教</a> | <a
											href='/jy_a0_s155_c0_f0_x0_g1/'> 中国画家教</a> | <a
											href='/jy_a0_s156_c0_f0_x0_g1/'> 西洋画家教</a> | <a
											href='/jy_a0_s157_c0_f0_x0_g1/'> 服装设计家教</a> | <a
											href='/jy_a0_s158_c0_f0_x0_g1/'> 服装表演家教</a> | <a
											href='/jy_a0_s159_c0_f0_x0_g1/'> 交谊舞家教</a> | <a
											href='/jy_a0_s266_c0_f0_x0_g1/'> 拉丁舞家教</a> | <a
											href='/jy_a0_s160_c0_f0_x0_g1/'> 民族舞家教</a> | <a
											href='/jy_a0_s161_c0_f0_x0_g1/'> 芭蕾舞家教</a> | <a
											href='/jy_a0_s162_c0_f0_x0_g1/'> 爵士舞家教</a> | <a
											href='/jy_a0_s163_c0_f0_x0_g1/'> 少儿舞家教</a> | <a
											href='/jy_a0_s164_c0_f0_x0_g1/'> 街舞家教</a> | <a
											href='/jy_a0_s165_c0_f0_x0_g1/'> 卡拉OK/歌咏家教</a> | <a
											href='/jy_a0_s166_c0_f0_x0_g1/'> 音乐启蒙家教</a> | <a
											href='/jy_a0_s167_c0_f0_x0_g1/'> 视唱练耳家教</a> | <a
											href='/jy_a0_s168_c0_f0_x0_g1/'> 作曲与乐理家教</a> | <a
											href='/jy_a0_s169_c0_f0_x0_g1/'> 美声声乐家教</a> | <a
											href='/jy_a0_s170_c0_f0_x0_g1/'> 民族声乐家教</a> | <a
											href='/jy_a0_s261_c0_f0_x0_g1/'> 表演家教</a> | <a
											href='/jy_a0_s272_c0_f0_x0_g1/'> 演讲与主持家教</a> | <a
											href='/jy_a0_s171_c0_f0_x0_g1/'> 话剧家教</a> | <a
											href='/jy_a0_s172_c0_f0_x0_g1/'> 京剧家教</a> | <a
											href='/jy_a0_s173_c0_f0_x0_g1/'> 越剧家教</a> | <a
											href='/jy_a0_s174_c0_f0_x0_g1/'> 豫剧家教</a> | <a
											href='/jy_a0_s175_c0_f0_x0_g1/'> 沪剧家教</a> |

									</div>
									<div class="clear">&nbsp;</div>
								</li>
							</ul>
							<div class="clear">&nbsp;</div>
						</div>
					</div>

					<div class="libox">
						<div class='div1'>
							<h3>
								<a href='/jy_a0_s5010_c0_f0_x0_g1/'> 计算机家教</a>
							</h3>
							</p>
						</div>
						<div class="div2">
							<ul>
								<li>
									<div class="sclass">

										<a href='/jy_a0_s176_c0_f0_x0_g1/'> 计算机基本操作家教</a> | <a
											href='/jy_a0_s295_c0_f0_x0_g1/'> SEO优化家教</a> | <a
											href='/jy_a0_s177_c0_f0_x0_g1/'> 数据库家教</a> | <a
											href='/jy_a0_s281_c0_f0_x0_g1/'> Oracle家教</a> | <a
											href='/jy_a0_s282_c0_f0_x0_g1/'> SQL家教</a> | <a
											href='/jy_a0_s283_c0_f0_x0_g1/'> Mysql家教</a> | <a
											href='/jy_a0_s178_c0_f0_x0_g1/'> 网页设计与制作家教</a> | <a
											href='/jy_a0_s278_c0_f0_x0_g1/'> HTML(CSS)家教</a> | <a
											href='/jy_a0_s279_c0_f0_x0_g1/'> HTML5家教</a> | <a
											href='/jy_a0_s179_c0_f0_x0_g1/'> 计算机应用能力家教</a> | <a
											href='/jy_a0_s180_c0_f0_x0_g1/'> 计算机中级家教</a> | <a
											href='/jy_a0_s181_c0_f0_x0_g1/'> Linux或Unix家教</a> | <a
											href='/jy_a0_s274_c0_f0_x0_g1/'> PHP家教</a> | <a
											href='/jy_a0_s182_c0_f0_x0_g1/'> 网站开发家教</a> | <a
											href='/jy_a0_s273_c0_f0_x0_g1/'> .Net家教</a> | <a
											href='/jy_a0_s275_c0_f0_x0_g1/'> ASP家教</a> | <a
											href='/jy_a0_s276_c0_f0_x0_g1/'> JAVA家教</a> | <a
											href='/jy_a0_s277_c0_f0_x0_g1/'> JSP家教</a> | <a
											href='/jy_a0_s183_c0_f0_x0_g1/'> 网络工程家教</a> | <a
											href='/jy_a0_s280_c0_f0_x0_g1/'> Photoshop（PS）家教</a> | <a
											href='/jy_a0_s184_c0_f0_x0_g1/'> 图像处理软件家教</a> | <a
											href='/jy_a0_s284_c0_f0_x0_g1/'> CorelDRAW家教</a> | <a
											href='/jy_a0_s285_c0_f0_x0_g1/'> AutoCAD家教</a> | <a
											href='/jy_a0_s286_c0_f0_x0_g1/'> Illustrator家教</a> | <a
											href='/jy_a0_s287_c0_f0_x0_g1/'> Flash家教</a> | <a
											href='/jy_a0_s185_c0_f0_x0_g1/'> 动画制作家教</a> | <a
											href='/jy_a0_s288_c0_f0_x0_g1/'> 3DMAX家教</a> | <a
											href='/jy_a0_s289_c0_f0_x0_g1/'> Maya家教</a> | <a
											href='/jy_a0_s290_c0_f0_x0_g1/'> 影视后期家教</a> | <a
											href='/jy_a0_s291_c0_f0_x0_g1/'> 影视剪辑家教</a> | <a
											href='/jy_a0_s186_c0_f0_x0_g1/'> 程序设计家教</a> | <a
											href='/jy_a0_s292_c0_f0_x0_g1/'> C语言家教</a> | <a
											href='/jy_a0_s293_c0_f0_x0_g1/'> Android开发家教</a> | <a
											href='/jy_a0_s294_c0_f0_x0_g1/'> IOS开发家教</a> | <a
											href='/jy_a0_s187_c0_f0_x0_g1/'> 程序设计高级家教</a> | <a
											href='/jy_a0_s188_c0_f0_x0_g1/'> 微软认证家教</a> | <a
											href='/jy_a0_s233_c0_f0_x0_g1/'> 思科认证家教</a> | <a
											href='/jy_a0_s234_c0_f0_x0_g1/'> Oracle认证家教</a> | <a
											href='/jy_a0_s235_c0_f0_x0_g1/'> Linux认证家教</a> | <a
											href='/jy_a0_s311_c0_f0_x0_g1/'> CCNA家教</a> | <a
											href='/jy_a0_s236_c0_f0_x0_g1/'> 华为认证家教</a> | <a
											href='/jy_a0_s312_c0_f0_x0_g1/'> CCNP家教</a> | <a
											href='/jy_a0_s237_c0_f0_x0_g1/'> Java认证家教</a> | <a
											href='/jy_a0_s296_c0_f0_x0_g1/'> 原画设计家教</a> | <a
											href='/jy_a0_s297_c0_f0_x0_g1/'> 平面设计家教</a> | <a
											href='/jy_a0_s298_c0_f0_x0_g1/'> 室内设计家教</a> | <a
											href='/jy_a0_s299_c0_f0_x0_g1/'> 建筑设计家教</a> |

									</div>
									<div class="clear">&nbsp;</div>
								</li>
							</ul>
							<div class="clear">&nbsp;</div>
						</div>
					</div>

					<div class="libox">
						<div class='r2 div1'>
							<h3>
								<a href='/jy_a0_s5011_c0_f0_x0_g1/'> 棋类/体育家教</a>
							</h3>
							</p>
						</div>
						<div class="div2">
							<ul>
								<li>
									<div class="sclass">

										<a href='/jy_a0_s189_c0_f0_x0_g1/'> 围棋家教</a> | <a
											href='/jy_a0_s190_c0_f0_x0_g1/'> 中国象棋家教</a> | <a
											href='/jy_a0_s191_c0_f0_x0_g1/'> 国际象棋家教</a> | <a
											href='/jy_a0_s268_c0_f0_x0_g1/'> 国际跳棋家教</a> | <a
											href='/jy_a0_s269_c0_f0_x0_g1/'> 五子棋家教</a> | <a
											href='/jy_a0_s270_c0_f0_x0_g1/'> 桥牌家教</a> | <a
											href='/jy_a0_s192_c0_f0_x0_g1/'> 中国武术家教</a> | <a
											href='/jy_a0_s193_c0_f0_x0_g1/'> 气功家教</a> | <a
											href='/jy_a0_s194_c0_f0_x0_g1/'> 拳击家教</a> | <a
											href='/jy_a0_s195_c0_f0_x0_g1/'> 太极拳家教</a> | <a
											href='/jy_a0_s196_c0_f0_x0_g1/'> 跆拳道家教</a> | <a
											href='/jy_a0_s197_c0_f0_x0_g1/'> 空手道家教</a> | <a
											href='/jy_a0_s198_c0_f0_x0_g1/'> 减肥操家教</a> | <a
											href='/jy_a0_s199_c0_f0_x0_g1/'> 健美家教</a> | <a
											href='/jy_a0_s200_c0_f0_x0_g1/'> 体操家教</a> | <a
											href='/jy_a0_s201_c0_f0_x0_g1/'> 瑜珈家教</a> | <a
											href='/jy_a0_s202_c0_f0_x0_g1/'> 滑冰旱冰家教</a> | <a
											href='/jy_a0_s203_c0_f0_x0_g1/'> 游泳家教</a> | <a
											href='/jy_a0_s204_c0_f0_x0_g1/'> 保龄球家教</a> | <a
											href='/jy_a0_s205_c0_f0_x0_g1/'> 高尔夫家教</a> | <a
											href='/jy_a0_s206_c0_f0_x0_g1/'> 乒乓球家教</a> | <a
											href='/jy_a0_s207_c0_f0_x0_g1/'> 羽毛球家教</a> | <a
											href='/jy_a0_s208_c0_f0_x0_g1/'> 网球家教</a> | <a
											href='/jy_a0_s209_c0_f0_x0_g1/'> 篮球家教</a> | <a
											href='/jy_a0_s210_c0_f0_x0_g1/'> 足球家教</a> | <a
											href='/jy_a0_s211_c0_f0_x0_g1/'> 排球家教</a> |

									</div>
									<div class="clear">&nbsp;</div>
								</li>
							</ul>
							<div class="clear">&nbsp;</div>
						</div>
					</div>

					<div class="libox">
						<div class='div1'>
							<h3>
								<a href='/jy_a0_s5014_c0_f0_x0_g1/'> 资格类考试家教</a>
							</h3>
							</p>
						</div>
						<div class="div2">
							<ul>
								<li>
									<div class="sclass">

										<a href='/jy_a0_s238_c0_f0_x0_g1/'> 公务员考试家教</a> | <a
											href='/jy_a0_s300_c0_f0_x0_g1/'> 会计从业资格家教</a> | <a
											href='/jy_a0_s239_c0_f0_x0_g1/'> 报关员考试家教</a> | <a
											href='/jy_a0_s301_c0_f0_x0_g1/'> 基金从业家教</a> | <a
											href='/jy_a0_s240_c0_f0_x0_g1/'> 证券从业家教</a> | <a
											href='/jy_a0_s241_c0_f0_x0_g1/'> 银行从业家教</a> | <a
											href='/jy_a0_s242_c0_f0_x0_g1/'> 跟单员家教</a> | <a
											href='/jy_a0_s243_c0_f0_x0_g1/'> 司法考试家教</a> | <a
											href='/jy_a0_s244_c0_f0_x0_g1/'> 教师资格家教</a> | <a
											href='/jy_a0_s245_c0_f0_x0_g1/'> 国际商务师家教</a> | <a
											href='/jy_a0_s246_c0_f0_x0_g1/'> 报检员家教</a> | <a
											href='/jy_a0_s247_c0_f0_x0_g1/'> 价格鉴证师家教</a> | <a
											href='/jy_a0_s248_c0_f0_x0_g1/'> 社会工作者家教</a> | <a
											href='/jy_a0_s249_c0_f0_x0_g1/'> 物流师家教</a> | <a
											href='/jy_a0_s250_c0_f0_x0_g1/'> 人力资源师家教</a> | <a
											href='/jy_a0_s251_c0_f0_x0_g1/'> 外销员家教</a> | <a
											href='/jy_a0_s252_c0_f0_x0_g1/'> 导游考试家教</a> | <a
											href='/jy_a0_s253_c0_f0_x0_g1/'> 单证员家教</a> | <a
											href='/jy_a0_s254_c0_f0_x0_g1/'> 期货从业家教</a> | <a
											href='/jy_a0_s255_c0_f0_x0_g1/'> 管理咨询师家教</a> | <a
											href='/jy_a0_s302_c0_f0_x0_g1/'> 建造师家教</a> | <a
											href='/jy_a0_s303_c0_f0_x0_g1/'> 执业医师家教</a> | <a
											href='/jy_a0_s304_c0_f0_x0_g1/'> 执业护士家教</a> | <a
											href='/jy_a0_s305_c0_f0_x0_g1/'> 公共营养师家教</a> | <a
											href='/jy_a0_s306_c0_f0_x0_g1/'> 心理咨询师家教</a> | <a
											href='/jy_a0_s307_c0_f0_x0_g1/'> 秘书资格家教</a> |

									</div>
									<div class="clear">&nbsp;</div>
								</li>
							</ul>
							<div class="clear">&nbsp;</div>
						</div>
					</div>

				</div>
			</div>
			<!--end class-->
			<div class="clear10"></div>
			<!--xxclass-->
			<div class="xxClass">
				<div class="tit">
					<ul>
						<li class="on">高校分类</li>
						<li>区域分类</li>
					</ul>
				</div>
				<div class="content">
					<ul>

						<li><a href='/jy_a0_s0_c7_f0_g1/' title='复旦大学家教'> 复旦大学</a></li>

						<li><a href='/jy_a0_s0_c8_f0_g1/' title='上海交通大学家教'>
								上海交通大学</a></li>

						<li><a href='/jy_a0_s0_c9_f0_g1/' title='同济大学家教'> 同济大学</a></li>

						<li><a href='/jy_a0_s0_c10_f0_g1/' title='上海外国语大学家教'>
								上海外国语大学</a></li>

						<li><a href='/jy_a0_s0_c11_f0_g1/' title='华东师范大学家教'>
								华东师范大学</a></li>

						<li><a href='/jy_a0_s0_c15_f0_g1/' title='上海师范大学家教'>
								上海师范大学</a></li>

						<li><a href='/jy_a0_s0_c20_f0_g1/' title='中国美术学院家教'>
								中国美术学院</a></li>

						<li><a href='/jy_a0_s0_c21_f0_g1/' title='上海音乐学院家教'>
								上海音乐学院</a></li>

						<li><a href='/jy_a0_s0_c23_f0_g1/' title='上海体育学院家教'>
								上海体育学院</a></li>

					</ul>
					<ul class="hide">

						<li class="a1"><a href='/jy_a8_s0_c0_f0_g1/' title='闵行家教'>
								闵行家教</a></li>

						<li class="a1"><a href='/jy_a9_s0_c0_f0_g1/' title='徐汇家教'>
								徐汇家教</a></li>

						<li class="a1"><a href='/jy_a10_s0_c0_f0_g1/' title='杨浦家教'>
								杨浦家教</a></li>

						<li class="a1"><a href='/jy_a11_s0_c0_f0_g1/' title='虹口家教'>
								虹口家教</a></li>

						<li class="a1"><a href='/jy_a12_s0_c0_f0_g1/' title='长宁家教'>
								长宁家教</a></li>

						<li class="a1"><a href='/jy_a13_s0_c0_f0_g1/' title='静安家教'>
								静安家教</a></li>

						<li class="a1"><a href='/jy_a15_s0_c0_f0_g1/' title='黄浦家教'>
								黄浦家教</a></li>

						<li class="a1"><a href='/jy_a16_s0_c0_f0_g1/' title='闸北家教'>
								闸北家教</a></li>

						<li class="a1"><a href='/jy_a17_s0_c0_f0_g1/' title='普陀家教'>
								普陀家教</a></li>

						<li class="a1"><a href='/jy_a18_s0_c0_f0_g1/' title='浦东家教'>
								浦东家教</a></li>

						<li class="a1"><a href='/jy_a19_s0_c0_f0_g1/' title='宝山家教'>
								宝山家教</a></li>

						<li class="a1"><a href='/jy_a20_s0_c0_f0_g1/' title='嘉定家教'>
								嘉定家教</a></li>

						<li class="a1"><a href='/jy_a21_s0_c0_f0_g1/' title='青浦家教'>
								青浦家教</a></li>

						<li class="a1"><a href='/jy_a22_s0_c0_f0_g1/' title='奉贤家教'>
								奉贤家教</a></li>

						<li class="a1"><a href='/jy_a24_s0_c0_f0_g1/' title='金山家教'>
								金山家教</a></li>

						<li class="a1"><a href='/jy_a25_s0_c0_f0_g1/' title='松江家教'>
								松江家教</a></li>

						<li class="a1"><a href='/jy_a26_s0_c0_f0_g1/' title='崇明家教'>
								崇明家教</a></li>

					</ul>
				</div>
			</div>
			<!--end xxclass-->
			<div class="clear10"></div>
			<!--search-->
			<div class="serchBox">
				<div class="tit">
					<ul>
						<li class="on">快速搜索</li>
						<li>&nbsp;</li>
					</ul>
				</div>
				<div class="content">
					<div class="ipt">
						<input name="txtjybh" type="text" value="教员编号：" id="txtjybh"
							class="txt" /> <input type="button" value="搜 索" class="btn"
							id="btnjybh" />
					</div>
					<div class="ipt ipt2">
						<input name="txtxybh" type="text" value="订单编号：" id="txtxybh"
							class="txt" /> <input type="button" value="搜 索" class="btn"
							id="btnxybh" />
					</div>
				</div>
			</div>
			<!--end search-->
		</div>
		<!-- end idx left-->
		<!--idx mid-->
		<div class="idxmid">
			<div class="banner">
				<div id="foucsBox">
					<ul class="imgCon">
						<!--展示图片开始-->

						<li><a href="http://www.ygjj.com/adv/index.htm"
							rel="nofollow"> <img width="550" height="300"
								src="images/b1.jpg" style="z-index: -1;" />
						</a>
							<div class="imgTitle">
								<a href="http://www.ygjj.com/adv/index.htm" rel="nofollow">阳光家教，带来不同的体验</a>
							</div>
							<div class="showPage"></div></li>
						<li><a href="qy.aspx" target="_blank" rel="nofollow"> <img
								width="550" height="300" src="images/b2.jpg"
								style="z-index: -1;" />
						</a>
							<div class="imgTitle">
								<a href="qy.aspx" target="_blank" rel="nofollow">签约教员，为学习上保险</a>
							</div>
							<div class="showPage"></div></li>

						<li><a href="Join" target="_blank" rel="nofollow"> <img
								width="550" height="300" src="images/b6.jpg"
								style="z-index: -1;" />
						</a>
							<div class="imgTitle">
								<a href="Join" target="_blank" rel="nofollow">开启属于您的私人定制</a>
							</div>
							<div class="showPage"></div></li>

						<!--展示图片结束-->
					</ul>
					<div class="foucs"></div>
					<div class="rBtn foucsButton">
						<span></span> <img />
					</div>
					<div class="lBtn foucsButton">
						<span></span> <img />
					</div>
				</div>
			</div>
			<div class="clear10"></div>
			<!--jxfc-->
			<div class="jxfc">
				<div class="jxhead">
					<h3>教学风采</h3>
					<a href="Teachers.aspx?photo=1" class="more">更多+</a>
				</div>
				<div class="content">
					<div class="scrollcontainer">
						<ul>

							<li><a href='/T549095.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew549095-20160718150139660904.jpg' />
									</div>
									<p>
										编号：<span class="bh">188614</span>
									</p>
									<p>在校教员</p>
							</a></li>

							<li><a href='/T514837.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew514837-20160414174434650401.jpg' />
									</div>
									<p>
										编号：<span class="bh">176689</span>
									</p>
									<p>在校教员</p>
							</a></li>

							<li><a href='/T548000.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew548000-20160709143828933993.jpg' />
									</div>
									<p>
										编号：<span class="bh">188354</span>
									</p>
									<p>在校教员</p>
							</a></li>

							<li><a href='/T540601.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew540601-20160303091415477924.jpeg' />
									</div>
									<p>
										编号：<span class="bh">186121</span>
									</p>
									<p>在校教员</p>
							</a></li>

							<li><a href='/T536042.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew536042-20151031175205732360.jpg' />
									</div>
									<p>
										编号：<span class="bh">184764</span>
									</p>
									<p>在校教员</p>
							</a></li>

							<li><a href='/T535873.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew535873-20151027100028567888.jpg' />
									</div>
									<p>
										编号：<span class="bh">184693</span>
									</p>
									<p>在校教员</p>
							</a></li>

							<li><a href='/T546863.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew546863-20160630123014341737.jpg' />
									</div>
									<p>
										编号：<span class="bh">188085</span>
									</p>
									<p>在校教员</p>
							</a></li>

							<li><a href='/T536039.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew536039-20151213173907295494.jpg' />
									</div>
									<p>
										编号：<span class="bh">184762</span>
									</p>
									<p>在校教员</p>
							</a></li>

							<li><a href='/T515176.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew515176-20160625193008908465.jpg' />
									</div>
									<p>
										编号：<span class="bh">176829</span>
									</p>
									<p>在校教员</p>
							</a></li>

							<li><a href='/T536280.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew536280-20151111171529798444.jpg' />
									</div>
									<p>
										编号：<span class="bh">184825</span>
									</p>
									<p>在校教员</p>
							</a></li>

							<li><a href='/T536963.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew536963-20151124223141471533.jpg' />
									</div>
									<p>
										编号：<span class="bh">185066</span>
									</p>
									<p>在校教员</p>
							</a></li>

							<li><a href='/T549139.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew549139-20160718211758827276.JPG' />
									</div>
									<p>
										编号：<span class="bh">188622</span>
									</p>
									<p>在校教员</p>
							</a></li>

							<li><a href='/T541463.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew541463-20160319164850443609.jpg' />
									</div>
									<p>
										编号：<span class="bh">186420</span>
									</p>
									<p>在校教员</p>
							</a></li>

							<li><a href='/T547488.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew547488-20160705171827722138.jpg' />
									</div>
									<p>
										编号：<span class="bh">188257</span>
									</p>
									<p>在校教员</p>
							</a></li>

							<li><a href='/T543579.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew543579-20160430184043445328.JPG' />
									</div>
									<p>
										编号：<span class="bh">187076</span>
									</p>
									<p>在校教员</p>
							</a></li>

							<li><a href='/T542887.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew542887-20160416095818471308.JPG' />
									</div>
									<p>
										编号：<span class="bh">186834</span>
									</p>
									<p>在校教员</p>
							</a></li>

							<li><a href='/T536993.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew536993-20151125173420715269.jpg' />
									</div>
									<p>
										编号：<span class="bh">185075</span>
									</p>
									<p>在校教员</p>
							</a></li>

							<li><a href='/T532824.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew532824-20150830160746464099.jpg' />
									</div>
									<p>
										编号：<span class="bh">183706</span>
									</p>
									<p>其他教员</p>
							</a></li>

							<li><a href='/T550543.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew550543-20160805212012761775.jpg' />
									</div>
									<p>
										编号：<span class="bh">188929</span>
									</p>
									<p>在校教员</p>
							</a></li>

							<li><a href='/T535028.html' target='_blank'>
									<div>
										<img src='imgp/Thumbnailnew535028-20151008121031305236.jpeg' />
									</div>
									<p>
										编号：<span class="bh">184415</span>
									</p>
									<p>在校教员</p>
							</a></li>

						</ul>
					</div>
					<a class="abtn aleft" href="#left">左移</a> <a class="abtn aright"
						href="#right">右移</a>
				</div>
			</div>
			<!--end jxfc-->
			<div class="clear10"></div>
			<!--rec-->
			<div class="recBox">
				<div class="recontent">
					<div class="tit">
						<h2>专职教师家教</h2>
						<a href="jy_a0_s0_c0_f1_g1/" class="more">更多+</a>
					</div>
					<div class="items">
						<div class="clear20"></div>

						<div class='item'>
							<div class="tx">
								<a href='/T546623.html' target='_blank'> <img
									src='imgp/head546623-20160825151306491610.JPG' border='0'>
								</a>
							</div>
							<a href='/T546623.html' target='_blank'>
								<div class="con">
									<ul>
										<li>编号：<span class="bh">188015</span></li>
										<li>任职学校：本市 专业培训机构</li>
										<li>身份：<span class="cf60">在职专业培训机构教师</span></li>
										<li>专业：英语</li>
									</ul>
								</div>
							</a>
						</div>

						<div class='item ml15'>
							<div class="tx">
								<a href='/T535083.html' target='_blank'> <img
									src='imgp/head535083-20151009182034314304.jpg' border='0'>
								</a>
							</div>
							<a href='/T535083.html' target='_blank'>
								<div class="con">
									<ul>
										<li>编号：<span class="bh">184437</span></li>
										<li>任职学校：本市 专业培训机构</li>
										<li>身份：<span class="cf60">在职专业培训机构教师</span></li>
										<li>专业：物流管理</li>
									</ul>
								</div>
							</a>
						</div>

						<div class='item'>
							<div class="tx">
								<a href='/T544027.html' target='_blank'> <img
									src='imgp/head544027-20160511160627562912.jpg' border='0'>
								</a>
							</div>
							<a href='/T544027.html' target='_blank'>
								<div class="con">
									<ul>
										<li>编号：<span class="bh">187214</span></li>
										<li>任职学校：本市 区县重点初中</li>
										<li>身份：<span class="cf60">在职初中教师</span></li>
										<li>专业：数学</li>
									</ul>
								</div>
							</a>
						</div>

						<div class='item ml15'>
							<div class="tx">
								<a href='/T546340.html' target='_blank'> <img
									src='imgp/head546340-20160627232243338468.jpg' border='0'>
								</a>
							</div>
							<a href='/T546340.html' target='_blank'>
								<div class="con">
									<ul>
										<li>编号：<span class="bh">187925</span></li>
										<li>任职学校：本市 专业培训机构</li>
										<li>身份：<span class="cf60">在职专业培训机构教师</span></li>
										<li>专业：艺术设计</li>
									</ul>
								</div>
							</a>
						</div>

						<div class="clear"></div>
					</div>
					<div class="tit">
						<h2>大学生家教</h2>
						<a href="jy_a0_s0_c0_f2_g1/" class="more">更多+</a>
					</div>
					<div class="items">
						<div class="clear20"></div>

						<div class='item'>
							<div class="tx">
								<a href='/T537190.html' target='_blank'> <img
									src='imgp/head537190-20151130213451267703.jpg' border='0'>
								</a>
							</div>
							<a href='/T537190.html' target='_blank'>
								<div class="con">
									<ul>
										<li>编号：<span class="bh">185139</span></li>
										<li>所读学校：立信会计学院</li>
										<li>身份：<span class="cf60">在校大一学生</span></li>
										<li>时间：08-25</li>
									</ul>
								</div>
							</a>
						</div>

						<div class='item ml15'>
							<div class="tx">
								<a href='/T551091.html' target='_blank'> <img
									src='imgp/head551091-20160820181208854802.JPG' border='0'>
								</a>
							</div>
							<a href='/T551091.html' target='_blank'>
								<div class="con">
									<ul>
										<li>编号：<span class="bh">189065</span></li>
										<li>所读学校：上海海洋大学</li>
										<li>身份：<span class="cf60">在校大二学生</span></li>
										<li>时间：08-25</li>
									</ul>
								</div>
							</a>
						</div>

						<div class='item'>
							<div class="tx">
								<a href='/T531401.html' target='_blank'> <img
									src='imgp/head531401-20160522011656798862.JPG' border='0'>
								</a>
							</div>
							<a href='/T531401.html' target='_blank'>
								<div class="con">
									<ul>
										<li>编号：<span class="bh">183335</span></li>
										<li>所读学校：华东政法大学</li>
										<li>身份：<span class="cf60">在校大三学生</span></li>
										<li>时间：08-25</li>
									</ul>
								</div>
							</a>
						</div>

						<div class='item ml15'>
							<div class="tx">
								<a href='/T551140.html' target='_blank'> <img
									src='imgp/head551140-20160822151446779920.jpeg' border='0'>
								</a>
							</div>
							<a href='/T551140.html' target='_blank'>
								<div class="con">
									<ul>
										<li>编号：<span class="bh">189079</span></li>
										<li>所读学校：华东政法大学</li>
										<li>身份：<span class="cf60">在读硕士生</span></li>
										<li>时间：08-25</li>
									</ul>
								</div>
							</a>
						</div>

						<div class="clear"></div>
					</div>
				</div>
			</div>
			<!--end rec-->
			<!--zxxy-->
			<div class="zxxy">
				<div class="zxhead">
					<h2>最新家教兼职</h2>
					<a href="xy_a0_s0_x0_t0_g1/" class="more">更多+</a>
				</div>
				<div class="lst">

					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<th>编号</th>
							<th>辅导科目</th>
							<th>地址</th>
							<th>教员资格</th>
							<th>时间</th>
							<th>查看</th>
						</tr>

						<tr class=''>
							<td><a href='xueyuanshow.html#326838.html' target='_blank'>
									188609</a></td>
							<td><a href='xueyuanshow.html#326838.html' target='_blank'
								title='生物'> 高二生物</a></td>
							<td><a href='xueyuanshow.html#326838.html' target='_blank'>
									闵行</a></td>
							<td><a href='xueyuanshow.html#326838.html' target='_blank'
								title='擅长生物，需要有高中生辅导经验，需要长期的补习。'> 擅长生物，需要有高中生辅</a></td>
							<td>08-25</td>
							<td width="40">
								<div class="look">
									<a href='xueyuanshow.html#326838.html' target='_blank'>
										&nbsp;</a>
								</div>
							</td>
						</tr>

						<tr class='r2'>
							<td><a href='xueyuanshow.html#328015.html' target='_blank'>
									189523</a></td>
							<td><a href='xueyuanshow.html#328015.html' target='_blank'
								title='英语'> 六年级英语</a></td>
							<td><a href='xueyuanshow.html#328015.html' target='_blank'>
									闵行</a></td>
							<td><a href='xueyuanshow.html#328015.html' target='_blank'
								title='希望老师严格一点，主要是教授英语。最好是交大或者重点学校，优先男生'> 希望老师严格一点，主要是</a></td>
							<td>08-25</td>
							<td width="40">
								<div class="look">
									<a href='xueyuanshow.html#328015.html' target='_blank'>
										&nbsp;</a>
								</div>
							</td>
						</tr>

						<tr class=''>
							<td><a href='xueyuanshow.html#327789.html' target='_blank'>
									189335</a></td>
							<td><a href='xueyuanshow.html#327789.html' target='_blank'
								title='英语'> 五年级英语</a></td>
							<td><a href='xueyuanshow.html#327789.html' target='_blank'>
									闵行</a></td>
							<td><a href='xueyuanshow.html#327789.html' target='_blank'
								title='有经验的，英语好的'> 有经验的，英语好的</a></td>
							<td>08-25</td>
							<td width="40">
								<div class="look">
									<a href='xueyuanshow.html#327789.html' target='_blank'>
										&nbsp;</a>
								</div>
							</td>
						</tr>

						<tr class='r2'>
							<td><a href='xueyuanshow.html#328121.html' target='_blank'>
									189597</a></td>
							<td><a href='xueyuanshow.html#328121.html' target='_blank'
								title='全科作业辅导'> 三年级全科作业辅导</a></td>
							<td><a href='xueyuanshow.html#328121.html' target='_blank'>
									浦东</a></td>
							<td><a href='xueyuanshow.html#328121.html' target='_blank'
								title='有经验，耐心，上海人，最好可以长期'> 有经验，耐心，上海人，最</a></td>
							<td>08-25</td>
							<td width="40">
								<div class="look">
									<a href='xueyuanshow.html#328121.html' target='_blank'>
										&nbsp;</a>
								</div>
							</td>
						</tr>

						<tr class=''>
							<td><a href='xueyuanshow.html#327971.html' target='_blank'>
									189484</a></td>
							<td><a href='xueyuanshow.html#327971.html' target='_blank'
								title='全科'> 一年级全科</a></td>
							<td><a href='xueyuanshow.html#327971.html' target='_blank'>
									浦东</a></td>
							<td><a href='xueyuanshow.html#327971.html' target='_blank'
								title='认真负责有耐心的老师，一定要上海人'> 认真负责有耐心的老师，一</a></td>
							<td>08-25</td>
							<td width="40">
								<div class="look">
									<a href='xueyuanshow.html#327971.html' target='_blank'>
										&nbsp;</a>
								</div>
							</td>
						</tr>

					</table>

				</div>
			</div>
			<!--end jxfc-->
		</div>
		<!--end idx mid-->
		<!--idx right-->
		<div class="idxright">
			<!--idx loginbox-->
			<div class="loginbox">

				<a class="post" href="AddOrder.jsp"> &nbsp; </a>

				<div class="clear10">&nbsp;</div>
				<div class="login">
					<div class="tit">会员登录</div>
					<div class="content">
						<div class="ipt">
							<input name="txtAccount" type="text" id="txtAccount" />
						</div>
						<div class="ipt ipt2">
							<input name="txtPassword" type="password" id="txtPassword" />
						</div>
						<div class="ipt3">
							<!-- <input name="chk_save" type="checkbox" id="chk_save" /> <label
									for="chk_save"> 记住我的登录状态</label> -->

							<input name="login" type="radio" value="stu_login" id="stu_login"
								checked="checked" />学员登录 <input name="login" type="radio"
								value="tea_login" id="tea_login" />教员登录
						</div>
						<div class="ipt4">
							<input type="button" name="btnLogin" value="  " id="btnLogin"
								class="btn" />
						</div>
						<div class="txt4">
							<a href="Find.aspx" rel="nofollow">忘记密码？</a> <a
								href="register.jsp">免费注册！</a>
						</div>
					</div>
				</div>

			</div>
			<div class="clear10"></div>
			<div>
				<a href="qy.aspx" target="_blank" rel="nofollow"> <img
					src="images/qy.jpg" alt="签约教员" border="0" />
				</a>
			</div>
			<div class="clear10"></div>
			<!--idx help-->
			<div class="help">
				<div class="tit">帮助中心</div>
				<div class="content">
					<ul>
						<li><a href='/Cost' target='_blank' title='阳光家教网收费标准'><font
								color='#ff00cc'>阳光家教网收费标准</font></a></li>

						<li><a href='/D7173.html'> 阳光家教简介</a></li>

						<li><a href='/D7151.html'> 教员签约协议</a></li>

						<li><a href='/D6207.html'> 安排家教的工作流程</a></li>

						<li><a href='/D7149.html'> 如何请家教</a></li>

						<li><a href='/D6205.html'> 如何在线选择教员</a></li>

						<li><a href='/D1750.html'> 如何发布家教信息</a></li>

						<li><a href='/D6206.html'> 教员授课前该做些什么</a></li>

					</ul>
				</div>
			</div>
			<!--idx end help-->
			<!--idx jjdt-->
			<div class="jjdt">
				<div class="tit">最新成功家教记录</div>
				<div class="content">

					<a href='/T542990.html'>
						<ul>
							<li class="c1">08-25</li>
							<li class="c2">陈教员</li>
							<li class="c3">数学、英语家教</li>
						</ul> <a href='/T550006.html'>
							<ul>
								<li class="c1">08-25</li>
								<li class="c2">施教员</li>
								<li class="c3">英语家教</li>
							</ul> <a href='/T546623.html'>
								<ul>
									<li class="c1">08-25</li>
									<li class="c2">史教员</li>
									<li class="c3">英语家教</li>
								</ul> <a href='/T522800.html'>
									<ul>
										<li class="c1">08-25</li>
										<li class="c2">周教员</li>
										<li class="c3">全科作业辅导家教</li>
									</ul> <a href='/T528696.html'>
										<ul>
											<li class="c1">08-25</li>
											<li class="c2">邵教员</li>
											<li class="c3">小升初阅读和作文辅导家教</li>
										</ul> <a href='/T216030.html'>
											<ul>
												<li class="c1">08-25</li>
												<li class="c2">吕教员</li>
												<li class="c3">作业辅导家教</li>
											</ul> <a href='/T551176.html'>
												<ul>
													<li class="c1">08-25</li>
													<li class="c2">康教员</li>
													<li class="c3">数理化家教</li>
												</ul> <a href='/T363431.html'>
													<ul>
														<li class="c1">08-25</li>
														<li class="c2">蒋教员</li>
														<li class="c3">数学家教</li>
													</ul> <a href='/T546476.html'>
														<ul>
															<li class="c1">08-25</li>
															<li class="c2">黄教员</li>
															<li class="c3">语文家教</li>
														</ul> <a href='/T540253.html'>
															<ul>
																<li class="c1">08-24</li>
																<li class="c2">唐教员</li>
																<li class="c3">美术家教</li>
															</ul>

													</a>
				</div>
			</div>
			<!--idx end jjdt-->
			<!--idx zcjy-->
			<div class="zcjy">
				<div class="tit">最新注册教员</div>
				<div class="content">

					<ul>
						<a href='/T551389.html'>
							<li class="c1">08-25</li>
							<li class="c2">李教员</li>
							<li class="c3">在校教员</li>
						</a>
					</ul>

					<ul>
						<a href='/T551366.html'>
							<li class="c1">08-25</li>
							<li class="c2">顾教员</li>
							<li class="c3">其他教员</li>
						</a>
					</ul>

					<ul>
						<a href='/T551348.html'>
							<li class="c1">08-25</li>
							<li class="c2">戴教员</li>
							<li class="c3">在校教员</li>
						</a>
					</ul>

					<ul>
						<a href='/T551346.html'>
							<li class="c1">08-24</li>
							<li class="c2">朱教员</li>
							<li class="c3">在校教员</li>
						</a>
					</ul>

					<ul>
						<a href='/T551340.html'>
							<li class="c1">08-24</li>
							<li class="c2">王教员</li>
							<li class="c3">在校教员</li>
						</a>
					</ul>

					<ul>
						<a href='/T551327.html'>
							<li class="c1">08-24</li>
							<li class="c2">王教员</li>
							<li class="c3">其他教员</li>
						</a>
					</ul>

					<ul>
						<a href='/T551312.html'>
							<li class="c1">08-24</li>
							<li class="c2">甘教员</li>
							<li class="c3">在校教员</li>
						</a>
					</ul>

					<ul>
						<a href='/T551302.html'>
							<li class="c1">08-23</li>
							<li class="c2">刘教员</li>
							<li class="c3">专职教员</li>
						</a>
					</ul>

				</div>
			</div>
			<!--idx end zcjy-->
		</div>
		<!--end idx right-->
		<div class="clear5"></div>
		<div class="hot_news">
			<div class="bd">
				<dl>
					<dt>
						<a href="zx/1/24/1" title="家教小学资讯">小学资讯</a>
					</dt>

					<dd>
						<span> 2016/08/25</span><a href='show.html#32438.html'
							target="_blank" title='孩子, 这才是我送你出国背后的真正用意'>孩子,
							这才是我送你出国背后的真正用意</a>
					</dd>

					<dd>
						<span> 2016/08/24</span><a href='show.html#32151.html'
							target="_blank" title='天啦！这些作业本居然有“毒”，开学为孩子准备文具，一定注意这些事项！'>天啦！这些作业本居然有“毒”，开学为孩子准备文具，一定注意这些事项！</a>
					</dd>

					<dd>
						<span> 2016/08/23</span><a href='show.html#32102.html'
							target="_blank" title='一位作家给青少年的写作建议：年少正要多写字'>一位作家给青少年的写作建议：年少正要多写字</a>
					</dd>

					<dd>
						<span> 2016/08/22</span><a href='show.html#31972.html'
							target="_blank" title='重点中学历史老师：这一代学生将比我们更理性，更自信，也更有道德底线 ...'>重点中学历史老师：这一代学生将比我们更理性，更自信，也更有道德底线
							...</a>
					</dd>

					<dd>
						<span> 2016/08/18</span><a href='show.html#31677.html'
							target="_blank" title='孩子将来立足社会最需要的八种能力，培养要趁早'>孩子将来立足社会最需要的八种能力，培养要趁早</a>
					</dd>

				</dl>
				<dl>
					<dt>
						<a href="zx/2/24/1" title="家教初中资讯">初中资讯</a>
					</dt>

					<dd>
						<span> 2016/08/25</span><a href='show.html#32365.html'
							target="_blank" title='孩子，听说你想坐在路边鼓掌，难道你自己不需要掌声吗？'>孩子，听说你想坐在路边鼓掌，难道你自己不需要掌声吗？</a>
					</dd>

					<dd>
						<span> 2016/08/24</span><a href='show.html#32215.html'
							target="_blank" title='新学期，一个优秀语文老师给学生开的书单'>新学期，一个优秀语文老师给学生开的书单</a>
					</dd>

					<dd>
						<span> 2016/08/23</span><a href='show.html#32033.html'
							target="_blank" title='你在人生中最看重什么, 在教育上就最想让孩子得到什么'>你在人生中最看重什么,
							在教育上就最想让孩子得到什么</a>
					</dd>

					<dd>
						<span> 2016/08/22</span><a href='show.html#31889.html'
							target="_blank" title='北京十一学校校长：为什么阅读比上语文课更管用？'>北京十一学校校长：为什么阅读比上语文课更管用？</a>
					</dd>

					<dd>
						<span> 2016/08/19</span><a href='show.html#31756.html'
							target="_blank" title='到底陪不陪孩子写作业，怎么陪？这里有说法！'>到底陪不陪孩子写作业，怎么陪？这里有说法！</a>
					</dd>

				</dl>
				<dl>
					<dt>
						<a href="zx/3/24/1" title="家教高中资讯">高中资讯</a>
					</dt>

					<dd>
						<span> 2016/08/25</span><a href='show.html#32322.html'
							target="_blank" title='学习缺乏目标怎么办？试试“Tap-D”策略！'>学习缺乏目标怎么办？试试“Tap-D”策略！</a>
					</dd>

					<dd>
						<span> 2016/08/24</span><a href='show.html#32287.html'
							target="_blank" title='耶鲁女孩的背单词秘诀, 你绝对想不到!'>耶鲁女孩的背单词秘诀,
							你绝对想不到!</a>
					</dd>

					<dd>
						<span> 2016/08/23</span><a href='show.html#31995.html'
							target="_blank" title='毕淑敏：如何从浩如烟海的书海，找出最值得一读的书呢？'>毕淑敏：如何从浩如烟海的书海，找出最值得一读的书呢？</a>
					</dd>

					<dd>
						<span> 2016/08/22</span><a href='show.html#31842.html'
							target="_blank" title='美籍华人为何不太支持孩子学文科？'>美籍华人为何不太支持孩子学文科？</a>
					</dd>

					<dd>
						<span> 2016/08/19</span><a href='show.html#31816.html'
							target="_blank" title='开学在即 | 让孩子如何收心有妙招'>开学在即 | 让孩子如何收心有妙招</a>
					</dd>

				</dl>
			</div>
			<span class="prev">&lt;</span> <span class="next">&gt;</span>
		</div>
	</div>
	<!--idx end container-->

	<!--idx foot nav-->
	<div class="footNavBox">
		<div class="footNav">
			<div class="cityTel">
				<span>上海热线</span>
				<p>021-51082788</p>
			</div>
			<div class="navBox">
				<dl>
					<dt>会员指南</dt>
					<dd>
						<span>→ </span><a href="News/8/1" rel="nofollow">帮助中心</a>
					</dd>
					<dd>
						<span>→ </span><a href="D7149.html" rel="nofollow">如何请家教</a>
					</dd>
					<dd>
						<span>→ </span><a href="D7150.html" rel="nofollow">如何做家教</a>
					</dd>
					<dd>
						<span>→ </span><a href="D7151.html" rel="nofollow">教员签约协议</a>
					</dd>
				</dl>
				<dl>
					<dt>支付方式</dt>
					<dd>
						<span>→ </span><a href="D7152.html" rel="nofollow">在线支付</a>
					</dd>
					<dd>
						<span>→ </span><a href="Online.aspx" rel="nofollow">银行转账</a>
					</dd>
					<dd>
						<span>→ </span><a href="Cost.aspx" rel="nofollow">资费标准</a>
					</dd>
					<dd>
						<span>→ </span><a href="D7154.html" rel="nofollow">退款说明</a>
					</dd>
				</dl>
				<dl>
					<dt>服务条款</dt>
					<dd>
						<span>→ </span><a href="D7155.html" rel="nofollow">隐私保护</a>
					</dd>
					<dd>
						<span>→ </span><a href="D7156.html" rel="nofollow">侵权处理</a>
					</dd>
					<dd>
						<span>→ </span><a href="D7157.html" rel="nofollow">免责说明</a>
					</dd>
				</dl>
				<dl>
					<dt>关于我们</dt>
					<dd>
						<span>→ </span><a href="D7173.html" rel="nofollow">阳光家教简介</a>
					</dd>
					<dd>
						<span>→ </span><a href="News/8/1/" rel="nofollow">阳光家教公告</a>
					</dd>
					<dd>
						<span>→ </span><a href="D7161.html" rel="nofollow">联系我们</a>
					</dd>
					<dd>
						<span>→ </span><a href="Links" rel="nofollow">友情链接</a>
					</dd>
				</dl>
			</div>
			<div class="wx">
				<div class="tit">关注微信</div>
				<div class="con">
					<img src="images/wx.jpg" />
				</div>
			</div>
			<div class="clear10"></div>
			<div class="ps">
				【上海家教网】是阳光家教网的上海地区家教分站，是中国规模较大的正规、专业家教网站。我们为您提供最优质的上海家教，帮助上海小学老师、中学老师和大学生家教寻求家教兼职。欢迎致电<span
					class="focus">021-51082788</span>
			</div>
			<div class="line">&nbsp;</div>
			<div class="city">
				<dl>
					<dt>热门城市：</dt>
					<dd>
						<a href="#" title="上海家教网" rel="nofollow">上海家教</a>
					</dd>
					<dd>
						<a href="#" title="北京家教网" rel="nofollow">北京家教</a>
					</dd>
					<dd>
						<a href="#" title="广州家教网" rel="nofollow">广州家教</a>
					</dd>
					<dd>
						<a href="#" title="深圳家教网" rel="nofollow">深圳家教</a>
					</dd>
					<dd>
						<a href="#" title="南京家教网" rel="nofollow">南京家教</a>
					</dd>
					<dd>
						<a href="#" title="天津家教网" rel="nofollow">天津家教</a>
					</dd>
					<dd>
						<a href="#" title="武汉家教网" rel="nofollow">武汉家教</a>
					</dd>
					<dd>
						<a href="#" title="杭州家教网" rel="nofollow">杭州家教</a>
					</dd>
					<dd>
						<a href="#" title="西安家教网" rel="nofollow">西安家教</a>
					</dd>
					<dd>
						<a href="#" title="苏州家教网" rel="nofollow">苏州家教</a>
					</dd>
					<dd>
						<a href="#" title="成都家教网" rel="nofollow">成都家教</a>
					</dd>
					<dd>
						<a href="#" title="长沙家教网" rel="nofollow">长沙家教</a>
					</dd>
					<dd>
						<a href="#" title="沈阳家教网" rel="nofollow">沈阳家教</a>
					</dd>
					<dd>
						<a href="#" title="合肥家教网" rel="nofollow">合肥家教</a>
					</dd>
					<dd>
						<a href="#" title="大连家教网" rel="nofollow">大连家教</a>
					</dd>
					<dd>
						<a href="#" title="唐山家教网" rel="nofollow">唐山家教</a>
					</dd>
					<dd>
						<a href="#" title="芜湖家教网" rel="nofollow">芜湖家教</a>
					</dd>
					<dd>
						<a href="#" title="宁波家教网" rel="nofollow">宁波家教</a>
					</dd>
					<dd>
						<a href="#" title="桂林家教网" rel="nofollow">桂林家教</a>
					</dd>
					<dd>
						<a href="#" title="常州家教网" rel="nofollow">常州家教</a>
					</dd>
				</dl>
			</div>
		</div>
	</div>
	<!--idx end foot nav-->
	<!--idx end foot rc-->
	<div class="footRcBox">
		<div class="footRc">
			<div id="Footer1_divLink" class="link">
				<dl>
					<dt>友情链接：</dt>

					<dd>
						<a href='http://www.xm51.com/ ' target="_blank"> 厦门人才网</a>
					</dd>

					<dd>
						<a href='http://sh.58.com/jiaoshi/' target="_blank"> 上海教师招聘</a>
					</dd>

					<dd>
						<a href='http://shanghai.cncn.com' target="_blank"> 上海旅游</a>
					</dd>

					<dd>
						<a href='http://www.xinkb.org/' target="_blank"> 新课标教育中心</a>
					</dd>

					<dd>
						<a href='http://www.hunt007.com/shanghai.htm ' target="_blank">
							上海招聘网</a>
					</dd>

					<dd>
						<a href='http://china.findlaw.cn/shanghai' target="_blank">
							上海律师 </a>
					</dd>

					<dd>
						<a href='http://gx.offcn.com' target="_blank"> 广西人事考试网 </a>
					</dd>

					<dd>
						<a href='http://www.chinaacc.tv/jjs/' target="_blank"> 高级经济师考试</a>
					</dd>

					<dd>
						<a href='http://www.51report.com/free/' target="_blank">
							市场分析报告</a>
					</dd>

					<dd>
						<a href='http://www.taoke.com/company' target="_blank"> 培训机构</a>
					</dd>

					<dd>
						<a href='http://www.xzbu.com/qklb.htm' target="_blank"> 期刊</a>
					</dd>

					<dd>
						<a href='http://www.99zuowen.com/xiaoxuezuowen/' target="_blank">
							小学作文网</a>
					</dd>

					<dd>
						<a href='http://www.jialidun.com/video/' target="_blank"> 教学视频</a>
					</dd>

					<dd>
						<a href='http://www.25622.com/chuzhong/' target="_blank"> 初中作文</a>
					</dd>

					<dd>
						<a href='http://sh.ganji.com/jiajiao/' target="_blank"> 上海家教</a>
					</dd>

					<dd>
						<a href='http://www.xaxsc.com/' target="_blank"> 西安小升初网</a>
					</dd>

					<dd>
						<a href='http://www.51testing.net/' target="_blank"> 软件测试培训</a>
					</dd>

					<dd>
						<a href='http://www.91up.com/' target="_blank"> 91up快学堂</a>
					</dd>

				</dl>
				<div class="linkmore">
					<a href="Links">更多链接</a><span>→ </span><a href="Links">申请链接</a><span>→
					</span>
				</div>
			</div>
			<div class="clear10">&nbsp;</div>
			<div class="rc">
				<div class="le1">
					<a
						href='https://www.sgs.gov.cn/notice/notice/view?uuid=NEK5QOkBQXpLTJQkRvxeUwsIjveo5VPC&tab=01'
						target='_blank' rel="nofollow"><image src='images/gs.gif'
							border=0 /></a>
				</div>
				<div class="ri">
					《中华人民共和国法人营业执照》注册号：310120001560841<br />
					《中华人民共和国组织机构代码证》：75840655-7<br /> 本站法律顾问：上海明泰律师事务所 李居利律师
				</div>
			</div>
		</div>
	</div>
	<!--idx end foot rc-->



	<script type="text/javascript" src="js/jquery.SuperSlide.2.1.1.js"></script>
	<script type="text/javascript">
        // 隐藏过多文本
        $(".teacher_p").each(function () {
            var arr = [];
            if ($(this).height() > 21) {
                $(this).css({ "white-space": "nowrap", "cursor": "pointer" });
                $(this).after("<div class='flow_p' style='display:none;'></div>");
            };
            $(this).height(21);
        });
        // 经过显示文本
        $(".teacher_article").mouseenter(function () {
            $(this).children(".flow_p").show();
            $(this).addClass("light");
            $(this).children(".flow_p").text($(this).children(".teacher_p").text());
        }).mouseleave(function () {
            $(this).children(".flow_p").hide();
            $(this).removeClass("light");
        });
        ; $(function () {
            //$(".tabox").slide({ trigger: "click" });
            // 滚动信息
            $(".hot_news").slide({ mainCell: ".bd", autoPage: true, effect: "leftLoop", autoPlay: true, vis: 2, scroll: 1 });
            /*鼠标移过，左右按钮显示*/
            $(".hot_news").hover(function () { jQuery(this).find(".prev,.next").stop(true, true).fadeTo("show", .8) }, function () { jQuery(this).find(".prev,.next").fadeOut() });

        });
    </script>
	<script type="text/javascript" src="js/Xslider.js"></script>
	<script type="text/javascript" src="js/Validform_min.js"></script>
	<script type="text/javascript" src="js/Comm.js"></script>
	<script type="text/javascript">
        //科目
        $(".classBox2>.libox").hover(function () {
            $(this).children("div.div1").addClass("on");
            $(this).children("div.div2").show();
        }, function () {
            $(this).children("div.div1").removeClass("on");
            $(this).children("div.div2").hide();
        });
        document.getElementById('')
        //教学风采
        $(".jxfc>.content").Xslider({
            unitdisplayed: 4,
            numtoMove: 2,
            loop: "cycle"
        });

        //高校分类
        $(".xxClass>.tit>ul>li").hover(function () {
            $(".xxClass>.tit>ul>li").removeClass("on");
            $(this).addClass("on");
            $(".xxClass>.content>ul").hide();
            $(".xxClass>.content>ul:eq(" + $(this).index() + ")").show();
        });

        //搜索
        $("#txtjybh").focus(function () {
            if ($("#txtjybh").val() == "教员编号：")
                $("#txtjybh").val("");
        });
        $("#txtjybh").blur(function () {
            if ($("#txtjybh").val() == "")
                $("#txtjybh").val("教员编号：");
        });
        $("#txtxybh").focus(function () {
            if ($("#txtxybh").val() == "订单编号：")
                $("#txtxybh").val("");
        });
        $("#txtxybh").blur(function () {
            if ($("#txtxybh").val() == "")
                $("#txtxybh").val("订单编号：");
        });
        $("#btnjybh").click(function () {
            var _TeacherID = $("#txtjybh").val();
            if (_TeacherID != "教员编号：") {
                location.href = "Teachers.aspx?id=" + _TeacherID;
            }
        });
        $("#txtjybh").keydown(function () {
            if (event.keyCode == 13) {
                $("#btnjybh").click();
                return false;
            }
        });
        $("#txtxybh").keydown(function () {
            if (event.keyCode == 13) {
                $("#btnxybh").click();
                return false;
            }
        });

        $("#btnxybh").click(function () {
            var _nid = $("#txtxybh").val();
            if (_nid != "订单编号：") {
                location.href = "Orders.aspx?id=" + _nid;
            }
        });

        //
        //登录框
        $("#txtAccount").focus(function () {
            if ($("#txtAccount").val() == "请输入邮箱")
                $("#txtAccount").val("");
        });
        $("#txtAccount").blur(function () {
            if ($("#txtAccount").val() == "")
                $("#txtAccount").val("请输入邮箱");
        });


		function show_Student(ele,data){
			var w1='<div class="s_loginbox">'+'<div class="name">欢迎您：<span class="cf60">'
				+data.map.student.name+'</span></div><a class="logout">&nbsp;</a>'
				+'<div class="clear10"></div><ul><li class="li1">我的订单</li><li class="li2"><span class="red">'
				+1+'</span></li>'+'<li class="li3"><a href="/Student/OrderList" class="link2">查看</a></li></ul>'
				+'<ul><li class="li1">预约记录</li><li class="li2"><span class="red">'
		        +1+'</span></li><li class="li3"><a href="/Student/ApplyManage" class="link2">查看</a></li></ul>'
				+'<div class="clear"></div><div class="xq"><a href="/Student/Order.aspx">发布需求 &gt;</a></div><div class="grzx">'
				+'<a href="/Student/Index">&nbsp;</a></div>'
				$('ele').html(w1);
			}


        

		$(function(){
			$.ajax({
				 url:'checklogin',
				 type:'post',
				 dataType:"json",
				 success:function(data){
					if(data.code==100){
						var divlogin=$("#Header1_divLogin");
						var text="您好！欢迎来到阳光家教网！";
						var href=$("<a></a>").text("个人中心");
						var logout_a=$("<a></a>").attr("href","").addClass("logout").text(" 退出");
						//var headlogout=$("<input></input>").addClass("headlogout").text("退出").append(logout_a);
						var loginbox=$(".loginbox");
						if(data.map.type==1){
							//显示左上角信息
							divlogin.empty();
							divlogin.append(text).append(href).attr("href","student/index").append("| ").append(logout_a);
							//显示个人中心
							loginbox.empty();
							var w1='<div class="s_loginbox">'+'<div class="name">欢迎您：<span class="cf60">'
							+data.map.student.name+'</span></div><a href="" class="logout">&nbsp;</a>'
							+'<div class="clear10"></div><ul><li class="li1">我的订单</li><li class="li2"><span class="red">'
							+1+'</span></li>'+'<li class="li3"><a href="/Student/OrderList" class="link2">查看</a></li></ul>'
							+'<ul><li class="li1">预约记录</li><li class="li2"><span class="red">'
					        +1+'</span></li><li class="li3"><a href="/Student/ApplyManage" class="link2">查看</a></li></ul>'
							+'<div class="clear"></div><div class="xq"><a href="/Student/Order.aspx">发布需求 &gt;</a></div><div class="grzx">'
							+'<a href="student_home.html">&nbsp;</a></div>'
							loginbox.html(w1);
						}
					}
				}
			
			});
		});
		





        
		//登录
		$("#btnLogin").click(function(){
			var email=$("#txtAccount").val();
			var password=$("#txtPassword").val();
			var identiy=$("input:radio:checked").val();
			if(identiy=='stu_login'){
				 $.ajax({
				  url:'student/login',
				  type:'post',
				  dataType:"json",
				  data:"email="+email+"&password="+password,
				  success:function(data){
						if(data.code=='100'){
							alert(data.msg);
							window.location.href="index.html";
							}else{
							alert(data.msg);
						}
					 }
				});
			}else{
				 $.ajax({
					  url:'student/login',
					  type:'post',
					  dataType:"json",
					  data:"email="+email+"&password="+password,
					  success:function(data){
							if(data.code=='100')
								alert("登录成功");
							else{
								alert("登录失败，请检查密码和邮箱是否正确");
							}
						 }
					});
			}
		});
		//退出
		$(document).on("click",".logout",function(){
			$.ajax({
				url:'logout',
				type:'post',
				success:function(){
					window.location.reload();
				}
			});
			});

		
        
        var lmk123 = {
            com: function (con) {
                var t, imgArr = [], $lmk = $('#foucsBox'), $imgUl = $lmk.find('ul.imgCon'), $titleDiv = $lmk.find('div.showTitle'), $foucsDiv = $lmk.find('div.foucs'), $rlBtn = $lmk.find('.foucsButton'), $rBtn = $lmk.find('.rBtn'), $lBtn = $lmk.find('.lBtn'), config = {
                    len: $imgUl.find('li').length,
                    //自动滚动时间，默认两千毫秒（一秒等于一千毫秒）
                    timeo: 4000,
                    //宽，默认680px
                    wid: 550,
                    //高，默认380px
                    hei: 300
                }, i = 0, autoChange = function () {
                    $imgUl.animate({ marginLeft: '-' + i * config.wid + 'px' }, function () {
                        $foucsDiv.find('span:eq(' + i + ')').addClass('f').siblings().removeClass('f');
                        $rBtn.find('img').replaceWith(imgArr[(i === config.len - 1) ? 0 : (i + 1)]);
                        $lBtn.find('img').length !== 0 ? $lBtn.find('img:eq(0)').replaceWith(imgArr[(i === 0) ? (config.len - 1) : (i - 1)]) : $lBtn.append(imgArr[(i === 0) ? (config.len - 1) : (i - 1)]);
                        i += 1;
                        i = i === config.len ? 0 : i;
                    });
                };
                $imgUl.find('img').each(function (inde, ele) {
                    imgArr[inde] = new Image();
                    imgArr[inde].src = $(this).attr('src');
                });
                $imgUl.css('width', config.len * config.wid);
                $foucsDiv.html(function () {
                    var i, s = '';
                    for (i = 0; i < config.len; i += 1) {
                        s += '<span ' + (i === 0 ? 'class="f"' : '') + '></span>';
                    }
                    return s;
                });
                $rBtn.find('img').replaceWith(imgArr[(i === config.len - 1) ? 0 : (i + 1)]);
                $lBtn.find('img').length !== 0 ? $lBtn.find('img:eq(0)').replaceWith(imgArr[(i === 0) ? (config.len - 1) : (i - 1)]) : $lBtn.append(imgArr[(i === 0) ? (config.len - 1) : (i - 1)]);
                t = setInterval(autoChange, config.timeo);
                $lmk.mouseenter(function () { clearInterval(t); }).mouseleave(function () { t = setInterval(autoChange, config.timeo); });
                $rlBtn.hover(function () {
                    $(this).addClass('btnHover');
                }, function () {
                    $(this).removeClass('btnHover');
                }).click(function () {
                    i = $foucsDiv.find('span.f').index();
                    if ($(this).is('.lBtn')) {
                        i = (i === 0) ? (config.len - 1) : (i - 1);
                    } else {
                        i = (i === config.len - 1) ? 0 : (i + 1);
                    }
                    autoChange();
                });
                $foucsDiv.find('span').click(function () {
                    i = $(this).index();
                    autoChange();
                });
            }
        };
        //执行开始
        lmk123.com();

    </script>
	<!-- 	</form> -->
</body>
</html>
