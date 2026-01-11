from collections import Counter as cc
def solution(participant, completion):
    aa = cc(participant)
    ss = cc(completion)
    return list(aa - ss)[0]
    
