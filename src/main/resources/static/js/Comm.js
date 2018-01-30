
$(document).ready(function () {
    //主导航菜单
    var _nav = $("#hidNav").val();
    $(".navbox2>.nav").addClass("nav" + _nav);
    $(".navbox2>.nav>ul>li:eq(" + _nav + ")").addClass("on");


    //右侧伸缩框
    $(window).scroll(function () {
        var _top = 220 + $(document).scrollTop();
        $(".rightKf").css("top", _top + "px");
    });
    $(".rightKf").mouseover(function () {
        $(this).animate({ right: "0px" });
        $(this).css({ "background-positionX": "-79px" });
    });

    $(".rightKf>.kfNav>ul>li").hover(function () {
        var _n = $(this).index();
        $(".rightKf>.kfCon>div").hide();
        $(".rightKf>.kfCon>div:eq(" + _n + ")").show();
        $(".rightKf").css({ "background-positionY": -(388 * _n) + "px" });
    });
    $(".rightKf>.kfNav>.close").click(function () {
        $(".rightKf").animate({ right: "-348px" });
        $(".rightKf").css({ "background-positionX": "0" });
    });


    $(".linkBox").Xslider({
        unitdisplayed: 6,
        numtoMove: 1,
        autoscroll: 2500,
        loop: "cycle"
    });

    $("#btn2Submit").click(function () {
        var _username = $("#txt2UserName").val();
        var _mail = $("#txt2Mail").val();
        var _mobile = $("#txt2Mobile").val();
        var _Content = $("#txt2Content").val();

        var reg = /^(1)[0-9]{10}$/;
        if (!reg.test(_mobile)) {
            alert("错误!请输入11位的手机号！");
            return false;
        } else {
            $.get("handler/handler.ashx", { act: "reserve", userName: _username, mobile: _mobile, mail: _mail, content: _Content }, function (msg) {
                if (parseInt(msg) > 0) {
                    alert("模拟账户申请成功!");
                }
                else {
                    alert("模拟账户申请失败!");
                }
            });
        }

    });

});

function getDATE() {
    //var o = document.getElementById("date");

    var dayName = new Array("", "mon", "tue", "wed", "thu", "fri", "sat", "sun");
    var monName = new Array("Jan. ", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Ang.", "Sep.", "Oct.", "Nov.", "Dec.");
    var str = $("#hidTime").val();
    //alert(str);
    if (str == undefined) {
        str = '2018-08-08 18:18:18';
        //alert("2222");
    }
    str = str.replace(/-/g, "/");
    var now = new Date(str);

    var strDay;
    if ((now.getDate() == 1) || (now.getDate() != 11) && (now.getDate() % 10 == 1))   // Correction for 11th and 1st/21st/31st
        strDay = "st ";
    else if ((now.getDate() == 2) || (now.getDate() != 12) && (now.getDate() % 10 == 2)) // Correction for 12th and 2nd/22nd/32nd
        strDay = "nd ";
    else if ((now.getDate() == 3) || (now.getDate() != 13) && (now.getDate() % 10 == 3)) // Correction for 13th and 3rd/23rd/33rd
        strDay = "rd ";
    else
        strDay = "th ";

    //var str = dayName[now.getDay()] + " the " + now.getDate() + strDay + "of " + monName[now.getMonth()] + ' ' + now.getFullYear() + ' ' + now.getHours() + ':' + now.getMinutes() + ':' + now.getSeconds();
    var str = now.getDate() + strDay + "of " + monName[now.getMonth()] + ' ' + now.getFullYear() + ' ' + now.getHours() + ':' + now.getMinutes() + ':' + now.getSeconds();

    $("#curDate").html(str);
    //o.innerHTML = str;
}

function MyImage(Img,w,h){ 
var image=new Image(); 
image.src=Img.src; 
width=w;
height=h;
if(image.width>width||image.height>height){
w=image.width/width;
h=image.height/height;
if(w>h){
Img.width=width;
Img.height=image.height/w;

}else{
Img.height=height;
Img.width=image.width/h;
 }
}
}


function yesno() {
    if (confirm("是否将此留言信息删除?")) {
        return true;
    } else return false;
}


function addfavor(url, title) {
    if (confirm("网站名称：" + title + "\n网址：" + url + "\n确定添加收藏?")) {
        var ua = navigator.userAgent.toLowerCase();
        if (ua.indexOf("msie 8") > -1) {
            external.AddToFavoritesBar(url, title, ''); //IE8
        } else {
            try {
                window.external.addFavorite(url, title);
            } catch (e) {
                try {
                    window.sidebar.addPanel(title, url, ""); //firefox
                } catch (e) {
                    alert("加入收藏失败，请使用Ctrl+D进行添加");
                }
            }
        }
    }
    return false;
}

function SetHome(obj, url) {
    try {
        obj.style.behavior = 'url(#default#homepage)';
        obj.setHomePage(url);
    } catch (e) {
        if (window.netscape) {
            try {
                netscape.security.PrivilegeManager.enablePrivilege("UniversalXPConnect");
            } catch (e) {
                alert("抱歉，此操作被浏览器拒绝！\n\n请在浏览器地址栏输入\'about:config\'并回车然后将[signed.applets.codebase_principal_support]设置为'true'");
            };
        } else {
            alert("抱歉，您所使用的浏览器无法完成此操作。\n\n您需要手动将'" + url + "'设置为首页。");
        };
    };
};


function OnlineOver() {
    document.getElementById("divMenu").style.display = "none";
    document.getElementById("divOnline").style.display = "block";
    document.getElementById("divQQbox").style.width = "170px";
}



function OnlineOut() {
    document.getElementById("divMenu").style.display = "block";
    document.getElementById("divOnline").style.display = "none";
}

function hideMsgBox(theEvent) { //theEvent用来传入事件，Firefox的方式
    if (theEvent) {
        var browser = navigator.userAgent; //取得浏览器属性
        if (browser.indexOf("Firefox") > 0) { //如果是Firefox
            if (document.getElementById('divOnline').contains(theEvent.relatedTarget)) { //如果是子元素
                return; //结束函式
            }

        }
        if (browser.indexOf("MSIE") > 0) { //如果是IE

            if (document.getElementById('divOnline').contains(event.toElement)) { //如果是子元素

                return; //结束函式
            }

        }

    }
    /*要执行的操作*/
    document.getElementById("divMenu").style.display = "block";
    document.getElementById("divOnline").style.display = "none";
}

//规格化字符
function formatNumber(val, fixed) {
    var number = new Number(val);
    if (number == 0)
        number = "-";
    else
        number = new Number(val).toFixed(fixed)
    return number;
}

//规格化字符 百分比
function formatNumber2(val, fixed, per) {
    var number = new Number(val);

    if (number == 0 || isNaN(number))
        number = "-";
    else
        number = (number * 100).toFixed(fixed) + per;
    return number;
}

//val 源数据, cs 除数, fixed 小数位, un单位, per 替换字
function formatNumber3(val, cs, fixed, un, per) {
    var number = new Number(val);

    if (number == 0 || isNaN(number))
        number = per;
    else
        number = (number / cs).toFixed(fixed) + un;
    return number;
}

//规格化字符 红涨绿跌
//val 数据源
//fixed 小数位
//per 除数
//ud 单位
//rep 替换符号
function UpDown(val, fixed, per, ud, rep) {
    var number = new Number(val);

    if (number == 0 || isNaN(number))
        number = rep;
    else {
        if (number >= 0)
            number = "<span class=\"red\">" + (number * per).toFixed(fixed) + ud + "</span>";
        else
            number = "<span class=\"green\">" + (number * per).toFixed(fixed) + ud + "</span>";
    }
    return number;
}

//规格化字符 红涨绿跌 img
function UpDown2(val, fixed, per, ud, rep) {
    var number = new Number(val);

    if (number == 0 || isNaN(number))
        number = rep;
    else {
        if (number >= 0)
            number = "<span class=\"red\">" + (number * per).toFixed(fixed) + ud + "<img src=\"images/arrow_up.jpg\" /></span>";
        else
            number = "<span class=\"green\">" + (number * per).toFixed(fixed) + ud + "<img src=\"images/arrow_down.jpg\" /></span>";
    }
    return number;
}

//规格化字符 红涨绿跌 
function UpDown3(val, val2, fixed, per, ud, rep) {
    var number = new Number(val2);
    var rel = "-";
    if (number == 0 || isNaN(number))
        rel = rep;
    else {
        if (number >= 0)
            rel = "<span class=\"red\">" + (val * per).toFixed(fixed) + ud + "<img src=\"images/arrow_up.jpg\" /></span>";
        else
            rel = "<span class=\"green\">" + (val * per).toFixed(fixed) + ud + "<img src=\"images/arrow_down.jpg\" /></span>";
    }
    return rel;
}
//规格化字符 红涨绿跌 img
function UpDown4(val, val2, fixed, per, ud, rep) {
    var number = new Number(val2);
    var rel = "-";
    if (number == 0 || isNaN(number))
        rel = rep;
    else {
        if (number >= 0)
            rel = "<span class=\"red\">" + (val * per).toFixed(fixed) + ud + "</span>";
        else
            rel = "<span class=\"green\">" + (val * per).toFixed(fixed) + ud + "</span>";
    }
    return rel;
}

//规格化字符 红涨绿跌 img
function UpDown5(val, val2, fixed, per, ud, rep) {
    var v1 = new Number(val);
    var v2 = new Number(val2);
    var number = new Number(v1 - v2);
    var rel = "-";
    if (number == 0 || isNaN(number))
        rel = rep;
    else {
        if (number >= 0)
            rel = "<span class=\"red\">" + (val * per).toFixed(fixed) + ud + "</span>";
        else
            rel = "<span class=\"green\">" + (val * per).toFixed(fixed) + ud + "</span>";
    }
    return rel;
}

//nc ,s 替换 
function BSImg(nc, s) {
    var rel = s;
    if (nc > 0)
        rel = "<img src=\"images/ico_buy.gif\" />";
    else
        rel = "<img src=\"images/ico_sell.gif\" />";
    return rel;
}



function Idx() {
    $.get("handler/hq.ashx", { act: "01", rnd: Math.random() }, function (msg) {
        var a = eval(msg);
        var str = "";
        str += '<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">';
        str += '<tr>';
        str += '<th>时间</th>';
        str += '<th>代码</th>';
        str += '<th>名称</th>';
        str += '<th>最新价</th>';
        str += '<th>涨跌额</th>';
        str += '<th>开盘价</th>';
        str += '<th>最高价</th>';
        str += '</tr>';

        var arr = msg.EURUSD.split(',');    // hq_str_AUDUSD.split(',');
        var zd = formatNumber((parseFloat(arr[1]) - parseFloat(arr[3])), 4);
        if (zd >= 0)
            str += '<tr class=\"tr2 red\">';
        else
            str += '<tr class=\"tr2 green\">';
        str += '<td>' + arr[0] + '</td>';
        str += '<td>AUDUSD</td>';
        str += '<td>' + arr[9] + '</td>';
        str += '<td>' + arr[8] + '</td>';
        str += '<td>' + zd + '</td>';
        str += '<td>' + arr[5] + '</td>';
        str += '<td>' + arr[6] + '</td>';
        str += '</tr>';

        arr = msg.EURUSD.split(',');
        //arr = hq_str_EURUSD.split(',');
        zd = formatNumber((parseFloat(arr[1]) - parseFloat(arr[3])), 4);
        if (zd >= 0)
            str += '<tr class=\" red\">';
        else
            str += '<tr class=\" green\">';
        str += '<td>' + arr[0] + '</td>';
        str += '<td>EURUSD</td>';
        str += '<td>' + arr[9] + '</td>';
        str += '<td>' + arr[8] + '</td>';
        str += '<td>' + zd + '</td>';
        str += '<td>' + arr[5] + '</td>';
        str += '<td>' + arr[6] + '</td>';
        str += '</tr>';

        arr = msg.GBPUSD.split(',');
        //arr = hq_str_GBPUSD.split(',');
        zd = formatNumber((parseFloat(arr[1]) - parseFloat(arr[3])), 4);
        if (zd >= 0)
            str += '<tr class=\"tr2 red\">';
        else
            str += '<tr class=\"tr2 green\">';
        str += '<td>' + arr[0] + '</td>';
        str += '<td>GBPUSD</td>';
        str += '<td>' + arr[9] + '</td>';
        str += '<td>' + arr[8] + '</td>';
        str += '<td>' + zd + '</td>';
        str += '<td>' + arr[5] + '</td>';
        str += '<td>' + arr[6] + '</td>';
        str += '</tr>';

        arr = msg.NZDUSD.split(',');
        //arr = hq_str_NZDUSD.split(',');
        zd = formatNumber((parseFloat(arr[1]) - parseFloat(arr[3])), 4);
        if (zd >= 0)
            str += '<tr class=\" red\">';
        else
            str += '<tr class=\" green\">';
        str += '<td>' + arr[0] + '</td>';
        str += '<td>NZDUSD</td>';
        str += '<td>' + arr[9] + '</td>';
        str += '<td>' + arr[8] + '</td>';
        str += '<td>' + zd + '</td>';
        str += '<td>' + arr[5] + '</td>';
        str += '<td>' + arr[6] + '</td>';
        str += '</tr>';

        arr = msg.USDCAD.split(',');
        //arr = hq_str_USDCAD.split(',');
        zd = formatNumber((parseFloat(arr[1]) - parseFloat(arr[3])), 4);
        if (zd >= 0)
            str += '<tr class=\"tr2 red\">';
        else
            str += '<tr class=\"tr2 green\">';
        str += '<td>' + arr[0] + '</td>';
        str += '<td>USDCAD</td>';
        str += '<td>' + arr[9] + '</td>';
        str += '<td>' + arr[8] + '</td>';
        str += '<td>' + zd + '</td>';
        str += '<td>' + arr[5] + '</td>';
        str += '<td>' + arr[6] + '</td>';
        str += '</tr>';

        arr = msg.USDCHF.split(',');
        //arr = hq_str_USDCHF.split(',');
        zd = formatNumber((parseFloat(arr[1]) - parseFloat(arr[3])), 4);
        if (zd >= 0)
            str += '<tr class=\" red\">';
        else
            str += '<tr class=\" green\">';
        str += '<td>' + arr[0] + '</td>';
        str += '<td>USDCHF</td>';
        str += '<td>' + arr[9] + '</td>';
        str += '<td>' + arr[8] + '</td>';
        str += '<td>' + zd + '</td>';
        str += '<td>' + arr[5] + '</td>';
        str += '<td>' + arr[6] + '</td>';
        str += '</tr>';

        arr = msg.USDCNY.split(',');
        //arr = hq_str_USDCNY.split(',');
        zd = formatNumber((parseFloat(arr[1]) - parseFloat(arr[3])), 4);
        if (zd >= 0)
            str += '<tr class=\"tr2 red\">';
        else
            str += '<tr class=\"tr2 green\">';
        str += '<td>' + arr[0] + '</td>';
        str += '<td>USDCNY</td>';
        str += '<td>' + arr[9] + '</td>';
        str += '<td>' + arr[8] + '</td>';
        str += '<td>' + zd + '</td>';
        str += '<td>' + arr[5] + '</td>';
        str += '<td>' + arr[6] + '</td>';
        str += '</tr>';

        arr = msg.USDHKD.split(',');
        //arr = hq_str_USDHKD.split(',');
        zd = formatNumber((parseFloat(arr[1]) - parseFloat(arr[3])), 4);
        if (zd >= 0)
            str += '<tr class=\" red\">';
        else
            str += '<tr class=\" green\">';
        str += '<td>' + arr[0] + '</td>';
        str += '<td>USDHKD</td>';
        str += '<td>' + arr[9] + '</td>';
        str += '<td>' + arr[8] + '</td>';
        str += '<td>' + zd + '</td>';
        str += '<td>' + arr[5] + '</td>';
        str += '<td>' + arr[6] + '</td>';
        str += '</tr>';

        str += '</table>';
        $(".timely>.con").html(str);

    })
}
