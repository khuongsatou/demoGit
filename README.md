--------Tạo Respository Local------
git init TenRespository
tạo tenfile.txt
#git status // kiểm tra file chưa đưa vào commit
git add tenfile.txt
#git status // kiểm tra file đã đưa vào index chưa
git commit -m "ten message"
#git status // Nếu nó đã commit thì nó sẽ mất khỏi index
#gitk // để xem tree

--------Tạo Respository Remote-------
#lên github tạo repository

--------Kết nối Local và  Remote-------
git remote add origin https://github.com/khuongsatou/demoGit.git
git push -u origin master


-----------Clone source về vào 1 thư mục khác -------------
git clone https://github.com/khuongsatou/demoGit.git
# Có thể tạo ra thêm 1 file tenfile1.txt và commit xong git push

----------Lấy nội dung người khác commit về ---------------
git pull 
#nó sẽ đồng bộ lại local khi remote được update thêm file

--------Tạo ra 1 lỗi commit cùng lúc ---------
#B1: 2 người điều commit và push cùng lúc
#B2: Thằng nào commit trước sẽ nhận , Thằng commit sau #sẽ bị reject và ko thể commit lại được nữa.

--------Fix lỗi commit cùng lúc cùng sửa 1 dòng
#Đầu tiên
 git pull origin master
#Nó sẽ ghi vào chỗ bị lỗi <<Head... ---- >>>>>
#Giờ chỉ xóa dòng dư thừa và chỉnh commit lại và push lên
git log --graph --oneline
#xem lịch sử merge code đã sửa
#https://backlog.com/git-tutorial/vn/intro/intro6_2.html

---- Tạo Branch ----
git branch -b member1
git checkout member1
#thực hiện việc commit brach c1 để có thể có brach trên remote
#cách 2 dùng  lệnh
git push --set-upstream origin member2
#và bên source 1 thì git pull để lấy branch về.

-- Merge vào master ----.
#chỉnh sửa và commit merge bên branch member
#về master 
git merge member2

-- Làm việc nhiều branch--
git checkout member2

-- Xóa branch ---
git branch -d member2

-- Phục hồi branch ---
git reflog
git checkout -b mãHash

--Mô Hình ---
Branch chính (Main branch)
Branch tính năng(feature branch) (branch chủ đề(topic branch))
Branch phát hành (release branch)
Branch sửa lỗi (hotfix branch)


--Tag--
git tag tentag
#xem 
git log -decorate

--Quay về trước commit---
git reset --hard mãhash


