#include <stdio.h>
#include <malloc.h>
#include <stdlib.h> //包含了exit函数

struct Arr
{
    int * pBase;    //第一个元素地址
    int len;    //最大个数
    int cnt;  //个数
    // int increment;  //自动增长因子  allocate()动态内存扩充，比较复杂
};

void init_arr(struct Arr *, int length);
bool append_arr();
bool insert_Arr();
bool delete_Arr();
bool get();
bool is_empty(struct Arr * pArr);
bool is_full();
void sort_Arr();
void show_arr(struct Arr * pArr);
void reverse_Arr();


int main(void)
{
    struct Arr arr;

    init_arr(&arr,6);
    show_arr(&arr);
    // printf("%d\n",arr.len);
    return 0;
}

void init_arr(struct Arr * pArr, int length)
{
    pArr->pBase = (int *)malloc(sizeof(int) * length);
    //指向的结构体中的pBase变量
    if(NULL == pArr->pBase)
    {
        printf("动态内存分派失败！\n");
        exit(-1);
        //终止整个程序；        
    }else{
        pArr->len = length;
        pArr->cnt = 0;
    }return;
}
bool is_empty(struct Arr * pArr)
{
    if(0 == pArr->cnt)
    return true;
    else
    return false;
}

void show_arr(struct Arr * pArr)
{
    if(is_empty(pArr))
    {
        printf("数组为空！\n");
    }else{
        for(int i = 0; i<pArr->cnt; ++i)
        printf("%d",pArr->pBase[i]);
        printf("\n");
    }
}