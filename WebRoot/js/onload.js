//ȫ�ֱ���
var numCount;       //����������
var columnsCounts;  //����������
var pageCount;      //ÿҳ��ʾ������
var pageNum;        //��ҳ��
var currPageNum ;   //��ǰҳ��

//ҳ���ǩ����
var blockTable;
var preSpan;
var firstSpan;
var nextSpan;
var lastSpan;
var pageNumSpan;
var currPageSpan;



window.onload=function(){
    //ҳ���ǩ����
    blockTable = document.getElementById("blocks");
    preSpan = document.getElementById("spanPre");
    firstSpan = document.getElementById("spanFirst");
    nextSpan = document.getElementById("spanNext");
    lastSpan = document.getElementById("spanLast");
    pageNumSpan = document.getElementById("spanTotalPage");
    currPageSpan = document.getElementById("spanPageNum");

    numCount = document.getElementById("blocks").rows.length - 1;       //ȡtable��������Ϊ��������������ȥ������1��
    alert(numCount);
    columnsCounts = blockTable.rows[0].cells.length;
    pageCount = 5;
    pageNum = parseInt(numCount/pageCount);
    if(0 != numCount%pageCount){
        pageNum += 1;
    }

    firstPage();
};