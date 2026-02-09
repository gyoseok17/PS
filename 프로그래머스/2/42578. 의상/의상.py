def solution(clothes):
    dic = dict()
    sum = 1
    for i in range(len(clothes)):
        if clothes[i][1] in dic:
            dic[clothes[i][1]] += 1
        else:
            dic[clothes[i][1]] = 1
    
    for _,su in dic.items():
        sum *= su+1
        
    return sum-1