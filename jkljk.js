var f=(savefileId===-1?'config':savefileId===0?'global':'file'+savefileId)+'.rpgsave';
var a=document.createElement('a');
a.href='data:text/plain,'+data;a.setAttribute('download',f);
a.dispatchEvent(new MouseEvent('click',{view:window,bubbles:true,cancelable:true}));
false;


var f=(savefileId===-1?'config':savefileId===0?'global':'file'+savefileId)+'.rpgsave';
var a=document.createElement('a');
a.href='data:text/plain,'+data;a.setAttribute('download',f);
a.click();
false;


if(savefileId===1){data=''};false;