if __name__ == '__main__':
    N = int(input())
    list=[]
    for i in range(5):
        m=input()
        if(m=='print'):
			print(list)
		elif(m=='sort' or m=='pop' or m=='reverse'):
			
		elif(m=='insert'):
			index=int(input())
			value=int(input())
			list.eval(m(index,value))
			
