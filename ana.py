def count():
    s=input("Enter length ")
    p=raw_input("enter word")
    f=0
    flag=0
    l=[]
    l=[]
    for i in range(s):
        st=raw_input("enter the word")
        l.append(st)
    print l
    for i in l:
        for j in range(len(i)):
            for f in range(len(p)):
                if i[j]==p[f]:
                    flag+=1
        if flag==len(p):
            print i
        flag=0
count()
