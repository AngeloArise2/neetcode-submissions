class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        new = []
        for i in range(len(words)):
            for j in range(len(words)):
                if (words[i] in words[j] and i != j):
                    if words[i] not in new:
                        new.append(words[i])
        return new