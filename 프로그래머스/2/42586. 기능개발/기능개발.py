from collections import deque
def solution(progresses, speeds):
    answer = []
    finish = deque()
    
    for i,v in enumerate(progresses):
        day = 0
        while v < 100:
            day += 1
            v += speeds[i]
        finish.append(day)
    
    while finish:
        j=1
        while True:
            print(j, finish)
            if j < len(finish) and finish[0] >= finish[j]: #작거나 같은 것도
                j += 1
                continue
            answer.append(j)
            for _ in range(j):
                dump = finish.popleft()
            break
    
    return answer