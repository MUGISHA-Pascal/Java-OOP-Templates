#ifndef MEMBER_MANAGEMENT_H
#define MEMBER_MANAGEMENT_H

#include <string>

struct Member;

void addMember(const Member& member);
void displayAllMembers();
bool updateMember(int id, const Member& member);
bool deleteMember(int id);

#endif // MEMBER_MANAGEMENT_H
