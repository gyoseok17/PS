def solution(s):
    count = 0
    for i,v in enumerate(s):
        if i == 0 and v != '(' or count < 0:
            return False
        elif v == '(':
            count += 1
            continue
        elif v == ')':
            count -= 1
    
    if count == 0: return True
    else: return False