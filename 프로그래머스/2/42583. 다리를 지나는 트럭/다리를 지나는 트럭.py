def solution(bridge_length, weight, truck_weights):
    time = 0
    i = 0
    finish = 0
    ing = dict()# 몇번째 : 간거리
    while finish < len(truck_weights):
        time += 1    
        
        for v in list(ing.keys()):
            ing[v] += 1
            if ing[v] >= bridge_length:
                del ing[v]
                finish += 1
        
        if i < len(truck_weights) and len(ing) < bridge_length and weight >= sum([truck_weights[x] for x in ing.keys()]) + truck_weights[i]:
            ing[i] = 0
            i += 1
            
        # if time < 12:
        #     print(f"time:{time}, i:{i}. img:{ing}, finish:{finish}")
    
    return time
