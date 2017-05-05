//全局变量
var numCount;       //数据总数量
var columnsCounts;  //数据列数量
var pageCount;      //每页显示的数量
var pageNum;        //总页数
var currPageNum ;   //当前页数

//页面标签变量
var blockTable;
var preSpan;
var firstSpan;
var nextSpan;
var lastSpan;
var pageNumSpan;
var currPageSpan;



window.onload=function(){
    //页面标签变量
    blockTable = document.getElementById("blocks");
    preSpan = document.getElementById("spanPre");
    firstSpan = document.getElementById("spanFirst");
    nextSpan = document.getElementById("spanNext");
    lastSpan = document.getElementById("spanLast");
    pageNumSpan = document.getElementById("spanTotalPage");
    currPageSpan = document.getElementById("spanPageNum");

    numCount = document.getElementById("blocks").rows.length - 1;       //取table的行数作为数据总数量（减去标题行1）
    alert(numCount);
    columnsCounts = blockTable.rows[0].cells.length;
    pageCount = 5;
    pageNum = parseInt(numCount/pageCount);
    if(0 != numCount%pageCount){
        pageNum += 1;
    }

    firstPage();
};