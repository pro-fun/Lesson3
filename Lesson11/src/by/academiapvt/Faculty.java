package by.academiapvt;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty {
    private String nameOfTheFaculty;
    private List groupList = new ArrayList<>();
    private ifItsActive ifItsActive;

    public String getNameOfTheFaculty() {
        return nameOfTheFaculty;
    }

    public void setNameOfTheFaculty(String nameOfTheFaculty) {
        this.nameOfTheFaculty = nameOfTheFaculty;
    }

    public List getGroupList() {
        return groupList;
    }

    public void setGroupList(List groupList) {
        this.groupList = groupList;
    }

    public by.academiapvt.ifItsActive getIfItsActive() {
        return ifItsActive;
    }

    public void setIfItsActive(by.academiapvt.ifItsActive ifItsActive) {
        this.ifItsActive = ifItsActive;
    }

    public Faculty(String nameOfTheFaculty) {
        this.nameOfTheFaculty = nameOfTheFaculty;
    }

    public void toAddGroupAtTheFaculty(Group group) {
        groupList.add(group);
    }
    public void toRemoveGroupAtTheFaculty(Group group) {
        groupList.remove(group);
    }


    public void toChangeActivity() {
        getIfItsActive();
        if (ifItsActive == by.academiapvt.ifItsActive.ITS_ACTIVE) {
            setIfItsActive(by.academiapvt.ifItsActive.IT_IS_NOT_ACTIVE);
        } else setIfItsActive(by.academiapvt.ifItsActive.ITS_ACTIVE);
    }

    public void toCheckNumberOfStudents() {
        int i = 0;
        getGroupList();
        Group[] groups = new Group[groupList.size()];
        groupList.toArray(groups);
        for (Group group : groups) {
            i = i + group.getStudentsForGroup().size();
        }
        if (i <= 20) {
            setIfItsActive(by.academiapvt.ifItsActive.IT_IS_NOT_ACTIVE);
            System.out.println("Факультет не активен, количество студентов = " + i);
        } else {
            setIfItsActive(by.academiapvt.ifItsActive.ITS_ACTIVE);
            System.out.println("Факультет активен, количество студентов = " + i);
        }
    }

}
