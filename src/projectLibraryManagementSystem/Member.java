package projectLibraryManagementSystem;

public class Member {
    private int memberId;
    private String memberName;

    public void setMemberId(int memberId){
        this.memberId = memberId;
    }

    public void setMemberName(String memberName){
        this.memberName = memberName;
    }

    public int getMemberId(){
        return memberId;
    }

    public String getMemberName(){
        return memberName;
    }

    @Override
    public String toString(){
        return "Member Id : " + memberId + " \nMember Name : " + memberName;
    }

}
