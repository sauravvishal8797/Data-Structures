class hammer(object):
    def dna(self,str1,str2):
        self.str1=str1
        self.str2=str2
        j=0
        c=0
        for i in str1:
            if i!=self.str2[j]:
                c+=1
            j+=1
        print c
