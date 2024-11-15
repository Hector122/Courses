//import SideNav from "../ui/dashboard/sidenav";

import SideNav from "../ui/dashboard/sidenav";

export default function DashboardLayout({
  children,
}: {
  children: React.ReactNode;
}) {
  return (
    <div className="flex h-screen flex-col md:flex-row md:overflow-hidden">
      <SideNav />
      Este es el layout del Dashboard 
      <div className="flex-1">{children}</div>
      <div className="flex-grow p-6 md:overflow-y-auto md:p-12">{children}</div>
    </div>
  );
}
