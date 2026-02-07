def solution(arr):
    
    i = 1
    j = 0
    new = []
    new.append(arr[0])
    
    while i < len(arr):
        if new[j] != arr[i]:
            new.append(arr[i])
            j += 1
        i += 1
        
    
    return new