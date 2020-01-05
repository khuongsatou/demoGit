--------Tạo Respository Local------</br>
git init TenRespository </br>
tạo tenfile.txt</br>
#git status // kiểm tra file chưa đưa vào commit</br>
git add tenfile.txt</br>
#git status // kiểm tra file đã đưa vào index chưa</br>
git commit -m "ten message"</br>
#git status // Nếu nó đã commit thì nó sẽ mất khỏi index</br>
#gitk // để xem tree</br>
</br>
--------Tạo Respository Remote-------</br>
#lên github tạo repository</br>
</br>
--------Kết nối Local và  Remote-------</br>
git remote add origin https://github.com/khuongsatou/demoGit.git</br>
git push -u origin master</br>
</br>
</br>
-----------Clone source về vào 1 thư mục khác -------------</br>
git clone https://github.com/khuongsatou/demoGit.git</br>
#Có thể tạo ra thêm 1 file tenfile1.txt và commit xong git push</br>

----------Lấy nội dung người khác commit về ---------------</br>
git pull </br>
#nó sẽ đồng bộ lại local khi remote được update thêm file</br>
</br>
--------Tạo ra 1 lỗi commit cùng lúc ---------</br>
#B1: 2 người điều commit và push cùng lúc</br>
#B2: Thằng nào commit trước sẽ nhận , Thằng commit sau #sẽ bị reject và ko thể commit lại được nữa.</br>
</br>
--------Fix lỗi commit cùng lúc cùng sửa 1 dòng</br>
#Đầu tiên</br>
 git pull origin master</br>
#Nó sẽ ghi vào chỗ bị lỗi <<Head... ---- >>>>></br>
#Giờ chỉ xóa dòng dư thừa và chỉnh commit lại và push lên</br>
git log --graph --oneline</br>
#xem lịch sử merge code đã sửa</br>
#https://backlog.com/git-tutorial/vn/intro/intro6_2.html</br>
</br>
---- Tạo Branch ----</br>
git branch -b member1</br>
git checkout member1</br>
#thực hiện việc commit brach c1 để có thể có brach trên remote</br>
#cách 2 dùng  lệnh</br>
git push --set-upstream origin member2</br>
#và bên source 1 thì git pull để lấy branch về.</br>
</br>
-- Merge vào master ----.</br>
#chỉnh sửa và commit merge bên branch member</br>
#về master </br>
git merge member2</br>
</br>
-- Làm việc nhiều branch--</br>
git checkout member2</br>
</br>
-- Xóa branch ---</br>
git branch -d member2</br>
</br>
-- Phục hồi branch ---</br>
git reflog</br>
git checkout -b mãHash</br>
</br>
-- Đổi tên branch --
git branch -m tenbranchmới
</br>
--Mô Hình ---</br>
Branch chính (Main branch)</br>
Branch tính năng(feature branch) (branch chủ đề(topic branch))</br>
Branch phát hành (release branch)</br>
Branch sửa lỗi (hotfix branch)</br>
</br>
</br>
--Tag--</br>
git tag tentag</br>
#xem </br>
git log -decorate</br>
</br>
--Quay về trước commit---</br>
git reset --hard mãhash</br>


</br>

--Sử đổi commit ----
git commit --amend

#ctrl + c để Hiện chế độ exit </br>
#tiếp đó là :q! để thoát và save
# :qa! thoát ko save
