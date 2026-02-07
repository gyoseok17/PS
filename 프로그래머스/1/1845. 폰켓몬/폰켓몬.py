def solution(nums):
    choice = len(nums)/2
    aa = len(set(nums))
    return min(choice, aa)