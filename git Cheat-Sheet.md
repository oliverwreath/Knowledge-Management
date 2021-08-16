# Python Cheat-Sheet.md
# Common Commands
### git clone 
### git fetch 
### git pull 
### git status
### git log -3
### git commit -m ""
### git reset HEAD~1
```git
# soft 参数: 软回退表示将本地版本库的头指针全部重置到指定版本，且将这次提交之后的所有变更都移动到暂存区
# 默认的mixed参数: 会重置暂存区，即这次提交之后的所有变更都移动到未暂存阶段
# --hard 会重置暂存区，并且会将工作区代码也回退到这个版本

# Decide to scrap the feature and remove the associated commits
git reset --hard HEAD~2
```
The git reset HEAD~2 command moves the current branch backward by two commits, effectively removing the two snapshots we just created from the project history. Remember that this kind of reset should only be used on unpublished commits. Never perform the above operation if you’ve already pushed your commits to a shared repository.

---
### References:
- [Git Reset - atlassian](https://www.atlassian.com/git/tutorials/undoing-changes/git-reset)

